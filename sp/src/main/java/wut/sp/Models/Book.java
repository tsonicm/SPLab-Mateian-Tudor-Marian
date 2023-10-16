package wut.sp.Models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authors;
    private List<Chapter> chapters;

    public Book() {
    }

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<Author>();
    }

    public Book(String title, Author author) {
        this.title = title;
        this.authors = new ArrayList<Author>();
        this.authors.add(author);
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    public int createChapter(String string) {
        Chapter chapter = new Chapter(string);
        if (this.chapters == null) {
            this.chapters = new ArrayList<Chapter>();
        }
        this.chapters.add(chapter);
        return this.chapters.indexOf(chapter);
    }

    public Chapter getChapter(int indexChapterOne) {
        return this.chapters.get(indexChapterOne);
    }

    public String getTitle() {
        return this.title;
    }

    public void print() {
        System.out.println("Book: " + this.title);
        System.out.println("Authors: ");
        for (Author author : this.authors) {
            System.out.println(author.getName());
        }
        System.out.println("Chapters: ");
        for (Chapter chapter : this.chapters) {
            System.out.println(chapter.getName());
        }
    }
}
