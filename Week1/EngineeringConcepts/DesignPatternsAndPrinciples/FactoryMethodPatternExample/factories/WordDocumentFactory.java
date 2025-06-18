package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.factories;

import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents.Document;
import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
