package Week1_DataStructuresandAlgorithms.Handson7_FinancialForecasting.Code;

public class Main {
    
public static void main(String[] args) {
        FinancialForecastingRecEx recObj = new FinancialForecastingRecEx();
        FinancialForecastingIterativeEx iterObj = new FinancialForecastingIterativeEx();


        double initialAmount = 10000;
        double annualGrowthRate = 0.05;
        int numberOfYears = 5;

        double futureValRec = recObj.futureValue(initialAmount, annualGrowthRate, numberOfYears);

        double futureValIter = iterObj.futureValueIterative(initialAmount, annualGrowthRate, numberOfYears);

        Logger logger = Logger.getInstance();

        logger.log("Future Value Calculation using Recursion:");
        logger.log(String.format("Future Value after %d years: %.2f", numberOfYears, futureValRec));

        logger.log("Future Value Calculation using Iteration:");
        logger.log(String.format("Future Value after %d years: %.2f", numberOfYears, futureValIter));

        logger.log("Both methods yield the same result: " + (futureValRec == futureValIter));
    }
}
