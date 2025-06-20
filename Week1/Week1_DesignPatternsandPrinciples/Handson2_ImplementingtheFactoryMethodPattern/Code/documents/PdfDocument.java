package Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.documents;


public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document...");
    }
}
