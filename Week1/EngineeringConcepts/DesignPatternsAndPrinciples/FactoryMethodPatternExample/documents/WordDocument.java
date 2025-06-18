package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents;

public class WordDocument implements Document {
    public void open() {
        System.out.println("Opening Word document...");
    }
}
