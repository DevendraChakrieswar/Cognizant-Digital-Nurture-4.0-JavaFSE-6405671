package Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.factories;

import Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.documents.Document;
import Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.documents.WordDocument;



public class WordDocumentFactory extends DocumentFactory {
    @Override
    public Document createDocument() {
        return new WordDocument();
    }
}
