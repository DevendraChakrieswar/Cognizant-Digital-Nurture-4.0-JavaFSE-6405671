package Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.documents;


public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel document...");
    }
}
