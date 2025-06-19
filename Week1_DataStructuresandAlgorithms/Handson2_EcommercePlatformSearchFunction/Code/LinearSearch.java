package Week1_DataStructuresandAlgorithms.Handson2_EcommercePlatformSearchFunction.Code;

import java.util.List;

public class LinearSearch {
    public static Product search(List<Product> products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }    
}
