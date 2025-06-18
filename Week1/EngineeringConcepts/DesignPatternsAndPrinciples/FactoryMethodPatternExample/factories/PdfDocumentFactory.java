package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.factories;

import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents.Document;
import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new PdfDocument();
    }
}
