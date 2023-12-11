package sp.lab.Models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Section {
    private List<Author> authorList;

    public Book(String title) {
        super(title);
        this.authorList = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authorList.add(author);
    }

    public void addContent(Element element) {
        try {
            super.add(element);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void accept(IVisitor visitor) {
        visitor.visitBook(this);
        for (Element element : super.elementList) {
            element.accept(visitor);
        }
    }

    public void print() {
        System.out.println("Book: " + this.getTitle() + '\n');

        System.out.println("Authors: ");
        for (Author author : this.authorList) {
            author.print();
        }

        System.out.println("\nContent: ");
        for (Element element : super.elementList) {
            element.print();
        }
    }
}