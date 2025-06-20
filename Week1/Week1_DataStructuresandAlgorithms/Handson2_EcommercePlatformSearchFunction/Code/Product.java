package Week1_DataStructuresandAlgorithms.Handson2_EcommercePlatformSearchFunction.Code;

public class Product {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public Product() {
        // Default constructor
    }

    // Setters for productId, productName, and category
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    // Getters for productId, productName, and category
    public int getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public String getCategory() {
        return category;
    }
}
