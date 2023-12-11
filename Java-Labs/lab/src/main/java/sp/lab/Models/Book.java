package sp.lab.Models;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private List<Author> authorList;
    private List<Chapter> chapterList;

    public Book(String title) {
        this.title = title;
        this.authorList = new ArrayList<>();
        this.chapterList = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        this.authorList.add(author);
    }

    public int createChapter(String chapterName) {
        Chapter chapter = new Chapter(chapterName);
        this.chapterList.add(chapter);
        return this.chapterList.indexOf(chapter);
    }

    public Chapter getChapter(int index) {
        return this.chapterList.get(index);
    }

    public void print() {
        System.out.println("Book: " + this.title);
        
        System.out.println("Authors:");
        for (Author author : this.authorList) {
            author.print();
        }

        System.out.println("Chapters:");
        for (Chapter chapter : this.chapterList) {
            chapter.print();
        }
    }
}
