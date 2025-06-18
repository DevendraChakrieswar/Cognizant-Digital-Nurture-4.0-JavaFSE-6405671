package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample;

import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.documents.Document;
import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.factories.DocumentFactory;
import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.factories.ExcelDocumentFactory;
import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.factories.PdfDocumentFactory;
import Week1.EngineeringConcepts.DesignPatternsAndPrinciples.FactoryMethodPatternExample.factories.WordDocumentFactory;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        Document word = wordFactory.createDocument();
        word.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdf = pdfFactory.createDocument();
        pdf.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excel = excelFactory.createDocument();
        excel.open();
    }
}
