package finance.modelling.data.transform.transformincomestatements.repository;

import finance.modelling.fmcommons.data.schema.model.IncomeStatements;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeStatementRepository extends ReactiveMongoRepository<IncomeStatements, String> {
}
