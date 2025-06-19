package Week1_DataStructuresandAlgorithms.Handson7_FinancialForecasting.Code;

public class FinancialForecastingRecEx {

    public double futureValue(double amount, double rate, int years) {
        if (years == 0) {
            return amount;
        }
        return (1 + rate) * futureValue(amount, rate, years - 1);
    }
}
