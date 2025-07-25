package Week1_DataStructuresandAlgorithms.Handson7_FinancialForecasting.Code;

import Week1_DataStructuresandAlgorithms.Handson2_EcommercePlatformSearchFunction.Code.Product;

public class Logger {
    private static Logger instance;

    private Logger() {
        // private constructor to prevent instantiation
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void logProduct(Product product) {
        System.out.println("Product Found:");
        System.out.println("ID       : " + product.getProductId());
        System.out.println("Name     : " + product.getProductName());
        System.out.println("Category : " + product.getCategory());
    }

    public void log(String message) {
        System.out.println(message);
    }
}
