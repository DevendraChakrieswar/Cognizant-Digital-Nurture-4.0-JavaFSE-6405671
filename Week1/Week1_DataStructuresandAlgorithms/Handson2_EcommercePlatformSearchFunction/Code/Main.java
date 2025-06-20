package Week1_DataStructuresandAlgorithms.Handson2_EcommercePlatformSearchFunction.Code;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(101, "Laptop", "Electronics"));
        products.add(new Product(102, "Tablet", "Electronics"));

        Product p1 = new Product();
        p1.setProductId(103);
        p1.setProductName("Phone"); 
        p1.setCategory("Electronics");
        products.add(p1);

        Product p2 = new Product();
        p2.setProductId(104);
        p2.setProductName("Smartwatch");
        p2.setCategory("Electronics");
        products.add(p2);

        products.add(new Product(105, "Headphones", "Accessories"));

        String target = "Phone";

        System.out.println("Linear Search Result:");
        Product result1 = LinearSearch.search(products, target);
        if (result1 != null) {
            Logger.getInstance().logProduct(result1);
        } else {
            System.out.println("Product not found");
        }

        System.out.println("\nBinary Search Result:");
        Product result2 = BinarySearch.search(products, target);
        if (result2 != null) {
            Logger.getInstance().logProduct(result2);
        } else {
            System.out.println("Product not found");
        }   
    }
}