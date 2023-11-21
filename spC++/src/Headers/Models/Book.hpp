#pragma once

#include "Section.hpp"
#include "Visitee.hpp"
#include "Author.hpp"
#include <list>

class Book : public Section, public Visitee {
private:
    std::list<Author> authorList;
public:
    Book(std::string title);
    Book(Book* book);
    void addAuthor(Author author);
    void accept(IVisitor* v) override;
    std::list<Author> getAuthors();
};