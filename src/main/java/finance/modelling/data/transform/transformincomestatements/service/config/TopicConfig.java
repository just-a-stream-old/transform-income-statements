package finance.modelling.data.transform.transformincomestatements.service.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class TopicConfig {

    private final String traceIdHeaderName;
    private final String ingestFmpIncomeStatementTopic;

    public TopicConfig(
            @Value("${spring.cloud.stream.kafka.streams.header.traceId}") String traceIdHeaderName,
            @Value("${spring.cloud.stream.bindings.generateIncomeStatementDataModel-in-0.destination}") String ingestFmpIncomeStatementTopic) {
        this.traceIdHeaderName = traceIdHeaderName;
        this.ingestFmpIncomeStatementTopic = ingestFmpIncomeStatementTopic;
    }
}
