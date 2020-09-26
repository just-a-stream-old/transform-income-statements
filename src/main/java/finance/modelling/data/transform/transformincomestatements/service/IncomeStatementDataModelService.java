package finance.modelling.data.transform.transformincomestatements.service;

import finance.modelling.fmcommons.data.schema.fmp.dto.FmpIncomeStatementsDTO;
import org.apache.kafka.streams.kstream.KStream;

import java.util.function.Consumer;

public interface IncomeStatementDataModelService {
    Consumer<KStream<String, FmpIncomeStatementsDTO>> generateIncomeStatementDataModel();
}
