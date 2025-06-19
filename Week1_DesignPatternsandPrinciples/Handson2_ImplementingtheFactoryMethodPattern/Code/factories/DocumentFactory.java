package Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.factories;

import Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.documents.Document;


public abstract class DocumentFactory {
    public abstract Document createDocument();
}
