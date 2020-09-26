package finance.modelling.data.transform.transformincomestatements.service;

import finance.modelling.data.transform.transformincomestatements.repository.IncomeStatementRepository;
import finance.modelling.data.transform.transformincomestatements.repository.config.MongoDbConfig;
import finance.modelling.data.transform.transformincomestatements.repository.mapper.IncomeStatementsMapper;
import finance.modelling.data.transform.transformincomestatements.service.config.TopicConfig;
import finance.modelling.fmcommons.data.logging.LogDb;
import finance.modelling.fmcommons.data.logging.kstream.LogMessageConsumed;
import finance.modelling.fmcommons.data.schema.fmp.dto.FmpBalanceSheetsDTO;
import finance.modelling.fmcommons.data.schema.fmp.dto.FmpIncomeStatementsDTO;
import finance.modelling.fmcommons.data.schema.model.IncomeStatements;
import org.apache.kafka.streams.kstream.KStream;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.function.Consumer;

@Service
public class IncomeStatementDataModelServiceImpl implements IncomeStatementDataModelService {

    private final TopicConfig topics;
    private final IncomeStatementRepository IncomeStatementRepository;
    private final MongoDbConfig dbConfig;

    public IncomeStatementDataModelServiceImpl(
            TopicConfig topics,
            IncomeStatementRepository IncomeStatementRepository,
            MongoDbConfig dbConfig) {
        this.topics = topics;
        this.IncomeStatementRepository = IncomeStatementRepository;
        this.dbConfig = dbConfig;
    }

    @Bean
    public Consumer<KStream<String, FmpIncomeStatementsDTO>> generateIncomeStatementDataModel() {
        return fmpBalanceSheets -> fmpBalanceSheets
                .transformValues(() -> new LogMessageConsumed<>(topics.getTraceIdHeaderName()))
                .mapValues(IncomeStatementsMapper.INSTANCE::IncomeStatementsDTOToIncomeStatements)
                .foreach(this::saveToIncomeStatementRepository);
    }

    protected void saveToIncomeStatementRepository(String _key, IncomeStatements IncomeStatements) {
        Mono
                .just(IncomeStatements)
                .flatMap(IncomeStatementRepository::save)
                .subscribe(
                        IncomeStatementsMono -> LogDb.logInfoDataItemSaved(
                                IncomeStatements.class, IncomeStatementsMono.getSymbol(), dbConfig.getDbUri()),
                        error -> LogDb.logErrorFailedDataItemSave(
                                IncomeStatements.class, error, dbConfig.getDbUri(), List.of("Log and fail"))
                );
    }
}
