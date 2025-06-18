package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.factories;

import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents.Document;

public abstract class DocumentFactory {
    public abstract Document createDocument();
}
