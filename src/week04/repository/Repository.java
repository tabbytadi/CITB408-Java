package week04.repository;

import java.util.ArrayList;
import java.util.List;

public class Repository {
    private double capacity;
    private Document[] documents;
    private List<Document> documentList;

    public Repository(double capacity) {
        this.capacity = capacity;
        this.documents = new Document[20];
        this.documentList = new ArrayList<>();
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean addDocument(Document document) {
       if(this.documentList.contains(document)) return false;
       return this.documentList.add(document);
    }

    public void addDocument(Document document, int index) {
        this.documents[index] = document;
    }

    public boolean removeDocument(Document document) {
        return this.documentList.remove(document);
    }

    public Document removeDocument(int index) {
        return this.documentList.remove(index);
    }

    public int documentListSize() {
        return this.documentList.size();
    }

    public void printDocumentsList() {
        for(Document document : this.documentList) {
            System.out.println(document);
        }
    }

    public void printDocumentByFormatType(FormatType formatType) {
        for(Document document : this.documentList) {
            if(document.getFormatType().equals(formatType)) {
                System.out.println(document);
            }
        }
    }

    public void printDocumentsArray() {
        for(Document document : this.documents)
            System.out.println(document);
    }
    @Override
    public String toString() {
        return "Repository{" +
                "capacity=" + capacity +
                '}';
    }
}
