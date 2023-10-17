package wut.sp.Models;

public class Author {
    private String name, surname;

    public Author() {
    }

    public Author(String name) {
        this.name = name;
        this.surname = "";
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("Author: " + this.name + " " + this.surname);
    }

    public String getName() {
        return this.name;
    }
}
