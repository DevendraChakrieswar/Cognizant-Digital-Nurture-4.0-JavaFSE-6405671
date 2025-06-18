package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening Excel document...");
    }
}
