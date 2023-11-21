#include "Headers/Models/Book.hpp"

Book::Book(std::string title) : Section(title) {}

Book::Book(Book* book) : Section(book->title) {
    this->authorList = book->authorList;
}

void Book::addAuthor(Author author) {
    this->authorList.push_back(author);
}

void Book::accept(IVisitor* v) {
    v->visitBook(this);
}

std::list<Author> Book::getAuthors() {
    return this->authorList;
}