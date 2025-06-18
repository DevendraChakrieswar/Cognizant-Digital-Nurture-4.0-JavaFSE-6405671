package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening PDF document...");
    }
}
