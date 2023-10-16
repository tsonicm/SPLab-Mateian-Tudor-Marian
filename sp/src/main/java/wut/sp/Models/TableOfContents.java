package wut.sp.Models;

public class TableOfContents {
    private Book book;

    public TableOfContents() {
    }

    public TableOfContents(Book book) {
        this.book = book;
    }

    public void print() {
        System.out.println("Table of contents: " + this.book.getTitle());
    }
}
