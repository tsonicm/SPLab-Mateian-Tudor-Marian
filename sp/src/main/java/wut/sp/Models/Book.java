package wut.sp.Models;

import java.util.ArrayList;
import java.util.List;

import wut.sp.Interfaces.IElement;

public class Book extends Section{
    private String title;
    private List<Author> authors;
    private List<IElement> sections;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<Author>();
        this.sections = new ArrayList<IElement>();
    }

    public Book(String title, Author author) {
        this.title = title;
        this.authors = new ArrayList<Author>();
        this.authors.add(author);
        this.sections = new ArrayList<IElement>();
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public void addContent(IElement element) {
        this.sections.add(element);
    }

    public String getTitle() {
        return this.title;
    }

    public void print() {
        System.out.println("Book: " + this.title);
        System.out.println("\nAuthors:");
        for (Author author : this.authors) {
            author.print();
        }
        System.out.println();
        for (IElement section : this.sections) {
            section.print();
        }
    }
}
