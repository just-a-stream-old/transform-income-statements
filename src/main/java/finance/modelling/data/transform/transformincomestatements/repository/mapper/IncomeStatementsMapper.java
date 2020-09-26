package finance.modelling.data.transform.transformincomestatements.repository.mapper;

import finance.modelling.fmcommons.data.schema.fmp.dto.FmpIncomeStatementDTO;
import finance.modelling.fmcommons.data.schema.fmp.dto.FmpIncomeStatementsDTO;
import finance.modelling.fmcommons.data.schema.model.IncomeStatement;
import finance.modelling.fmcommons.data.schema.model.IncomeStatements;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface IncomeStatementsMapper {
    IncomeStatementsMapper INSTANCE = Mappers.getMapper(IncomeStatementsMapper.class);

    IncomeStatements incomeStatementsDTOToIncomeStatements(FmpIncomeStatementsDTO fmpIncomeStatementsDTO);
    IncomeStatement incomeStatementDTOToIncomeStatement(FmpIncomeStatementDTO fmpIncomeStatementDTO);
}
