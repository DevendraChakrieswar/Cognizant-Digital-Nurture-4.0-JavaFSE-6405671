package Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code;

// import statements for the factory and document classes
import Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.documents.Document;
import Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.factories.DocumentFactory;
import Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.factories.ExcelDocumentFactory;
import Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.factories.PdfDocumentFactory;
import Week1_DesignPatternsandPrinciples.Handson2_ImplementingtheFactoryMethodPattern.Code.factories.WordDocumentFactory;



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
