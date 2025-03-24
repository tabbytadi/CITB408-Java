import week04.repository.Document;
import week04.repository.FormatType;
import week04.repository.Repository;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {

        Document document1 = new Document("doc1", 5, FormatType.PDF);
        Document document2 = new Document("doc2", 10, FormatType.JPG);
        Document document3 = new Document("doc3", 10, FormatType.PDF);
        Document document4 = new Document("doc4", 5, FormatType.TXT);

        System.out.println(FormatType.TXT.getMaxSize());
        System.out.println(FormatType.PDF.getMaxSize());
        System.out.println("=======================");

        System.out.println(document1);
        System.out.println(document2);
        System.out.println(document3);
        System.out.println(document4);

        Repository repository = new Repository(30);
        System.out.println(repository);

        repository.addDocument(document1);
        repository.addDocument(document1);
        repository.addDocument(document2);

        //repository.printDocumentsList();
        System.out.println("=======================");

        repository.addDocument(document3, 0);
        repository.addDocument(document4, 1);
        System.out.println("Size: " + repository.documentListSize());
        //repository.printDocumentsArray();

        System.out.println("Removed " + repository.removeDocument(1));
        repository.printDocumentsList();

        repository.addDocument(document1);
        repository.addDocument(document2);
        repository.addDocument(document3);
        repository.addDocument(document4);
        System.out.println("=======================");
        repository.printDocumentByFormatType(FormatType.JPG);
    }
}