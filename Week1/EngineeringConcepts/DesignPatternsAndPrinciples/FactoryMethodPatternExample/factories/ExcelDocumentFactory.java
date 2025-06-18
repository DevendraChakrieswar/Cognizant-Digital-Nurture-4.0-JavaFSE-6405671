package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.factories;

import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents.Document;
import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new ExcelDocument();
    }
}
