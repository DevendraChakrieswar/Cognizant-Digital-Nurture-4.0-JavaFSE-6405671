package Week1_DataStructuresandAlgorithms.Handson7_FinancialForecasting.Code;

public class FinancialForecastingIterativeEx {

    public double futureValueIterative(double amount, double rate, int years) {
    double result = amount;
    for (int i = 0; i < years; i++) {
        result *= (1 + rate);
    }
    return result;
}

}
