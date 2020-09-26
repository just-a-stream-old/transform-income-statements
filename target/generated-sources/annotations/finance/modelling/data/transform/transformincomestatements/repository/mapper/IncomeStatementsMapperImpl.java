package finance.modelling.data.transform.transformincomestatements.repository.mapper;

import finance.modelling.fmcommons.data.schema.fmp.dto.FmpIncomeStatementDTO;
import finance.modelling.fmcommons.data.schema.fmp.dto.FmpIncomeStatementsDTO;
import finance.modelling.fmcommons.data.schema.model.IncomeStatement;
import finance.modelling.fmcommons.data.schema.model.IncomeStatements;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-09-26T21:33:05+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 14.0.1 (Private Build)"
)
@Component
public class IncomeStatementsMapperImpl implements IncomeStatementsMapper {

    @Override
    public IncomeStatements incomeStatementsDTOToIncomeStatements(FmpIncomeStatementsDTO fmpIncomeStatementsDTO) {
        if ( fmpIncomeStatementsDTO == null ) {
            return null;
        }

        IncomeStatements incomeStatements = new IncomeStatements();

        incomeStatements.setSymbol( fmpIncomeStatementsDTO.getSymbol() );
        incomeStatements.setIncomeStatements( fmpIncomeStatementDTOListToIncomeStatementList( fmpIncomeStatementsDTO.getIncomeStatements() ) );

        return incomeStatements;
    }

    @Override
    public IncomeStatement incomeStatementDTOToIncomeStatement(FmpIncomeStatementDTO fmpIncomeStatementDTO) {
        if ( fmpIncomeStatementDTO == null ) {
            return null;
        }

        IncomeStatement incomeStatement = new IncomeStatement();

        incomeStatement.setSymbol( fmpIncomeStatementDTO.getSymbol() );
        incomeStatement.setDate( fmpIncomeStatementDTO.getDate() );
        incomeStatement.setFillingDate( fmpIncomeStatementDTO.getFillingDate() );
        incomeStatement.setAcceptedDate( fmpIncomeStatementDTO.getAcceptedDate() );
        incomeStatement.setPeriod( fmpIncomeStatementDTO.getPeriod() );
        if ( fmpIncomeStatementDTO.getRevenue() != null ) {
            incomeStatement.setRevenue( fmpIncomeStatementDTO.getRevenue().intValue() );
        }
        if ( fmpIncomeStatementDTO.getCostOfRevenue() != null ) {
            incomeStatement.setCostOfRevenue( fmpIncomeStatementDTO.getCostOfRevenue().intValue() );
        }
        if ( fmpIncomeStatementDTO.getGrossProfit() != null ) {
            incomeStatement.setGrossProfit( fmpIncomeStatementDTO.getGrossProfit().intValue() );
        }
        incomeStatement.setGrossProfitRatio( fmpIncomeStatementDTO.getGrossProfitRatio() );
        if ( fmpIncomeStatementDTO.getResearchAndDevelopmentExpenses() != null ) {
            incomeStatement.setResearchAndDevelopmentExpenses( fmpIncomeStatementDTO.getResearchAndDevelopmentExpenses().intValue() );
        }
        if ( fmpIncomeStatementDTO.getGeneralAndAdministrativeExpenses() != null ) {
            incomeStatement.setGeneralAndAdministrativeExpenses( fmpIncomeStatementDTO.getGeneralAndAdministrativeExpenses().intValue() );
        }
        incomeStatement.setSellingAndMarketingExpenses( fmpIncomeStatementDTO.getSellingAndMarketingExpenses() );
        if ( fmpIncomeStatementDTO.getOtherExpenses() != null ) {
            incomeStatement.setOtherExpenses( fmpIncomeStatementDTO.getOtherExpenses().intValue() );
        }
        if ( fmpIncomeStatementDTO.getOperatingExpenses() != null ) {
            incomeStatement.setOperatingExpenses( fmpIncomeStatementDTO.getOperatingExpenses().intValue() );
        }
        if ( fmpIncomeStatementDTO.getCostAndExpenses() != null ) {
            incomeStatement.setCostAndExpenses( fmpIncomeStatementDTO.getCostAndExpenses().intValue() );
        }
        if ( fmpIncomeStatementDTO.getInterestExpense() != null ) {
            incomeStatement.setInterestExpense( fmpIncomeStatementDTO.getInterestExpense().intValue() );
        }
        if ( fmpIncomeStatementDTO.getDepreciationAndAmortization() != null ) {
            incomeStatement.setDepreciationAndAmortization( fmpIncomeStatementDTO.getDepreciationAndAmortization().intValue() );
        }
        if ( fmpIncomeStatementDTO.getEarningsBeforeInterestTaxesDepreciationAmortisation() != null ) {
            incomeStatement.setEarningsBeforeInterestTaxesDepreciationAmortisation( fmpIncomeStatementDTO.getEarningsBeforeInterestTaxesDepreciationAmortisation().intValue() );
        }
        incomeStatement.setRatioEarningsBeforeInterestTaxesDepreciationAmortisation( fmpIncomeStatementDTO.getRatioEarningsBeforeInterestTaxesDepreciationAmortisation() );
        if ( fmpIncomeStatementDTO.getOperatingIncome() != null ) {
            incomeStatement.setOperatingIncome( fmpIncomeStatementDTO.getOperatingIncome().intValue() );
        }
        incomeStatement.setOperatingIncomeRatio( fmpIncomeStatementDTO.getOperatingIncomeRatio() );
        if ( fmpIncomeStatementDTO.getTotalOtherIncomeExpensesNet() != null ) {
            incomeStatement.setTotalOtherIncomeExpensesNet( fmpIncomeStatementDTO.getTotalOtherIncomeExpensesNet().intValue() );
        }
        if ( fmpIncomeStatementDTO.getIncomeBeforeTax() != null ) {
            incomeStatement.setIncomeBeforeTax( fmpIncomeStatementDTO.getIncomeBeforeTax().intValue() );
        }
        incomeStatement.setIncomeBeforeTaxRatio( fmpIncomeStatementDTO.getIncomeBeforeTaxRatio() );
        if ( fmpIncomeStatementDTO.getIncomeTaxExpense() != null ) {
            incomeStatement.setIncomeTaxExpense( fmpIncomeStatementDTO.getIncomeTaxExpense().intValue() );
        }
        if ( fmpIncomeStatementDTO.getNetIncome() != null ) {
            incomeStatement.setNetIncome( fmpIncomeStatementDTO.getNetIncome().intValue() );
        }
        incomeStatement.setNetIncomeRatio( fmpIncomeStatementDTO.getNetIncomeRatio() );
        incomeStatement.setEps( fmpIncomeStatementDTO.getEps() );
        incomeStatement.setEpsDiluted( fmpIncomeStatementDTO.getEpsDiluted() );
        if ( fmpIncomeStatementDTO.getWeightedAverageShsOut() != null ) {
            incomeStatement.setWeightedAverageShsOut( fmpIncomeStatementDTO.getWeightedAverageShsOut().intValue() );
        }
        if ( fmpIncomeStatementDTO.getWeightedAverageShsOutDil() != null ) {
            incomeStatement.setWeightedAverageShsOutDil( fmpIncomeStatementDTO.getWeightedAverageShsOutDil().intValue() );
        }
        incomeStatement.setLink( fmpIncomeStatementDTO.getLink() );
        incomeStatement.setFinalLink( fmpIncomeStatementDTO.getFinalLink() );

        return incomeStatement;
    }

    protected List<IncomeStatement> fmpIncomeStatementDTOListToIncomeStatementList(List<FmpIncomeStatementDTO> list) {
        if ( list == null ) {
            return null;
        }

        List<IncomeStatement> list1 = new ArrayList<IncomeStatement>( list.size() );
        for ( FmpIncomeStatementDTO fmpIncomeStatementDTO : list ) {
            list1.add( incomeStatementDTOToIncomeStatement( fmpIncomeStatementDTO ) );
        }

        return list1;
    }
}
