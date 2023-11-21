#include "Headers/Models/Author.hpp"

Author::Author(std::string name, std::string surname) {
    this->name = name;
    this->surname = surname;
}

Author::Author(std::string name) {
    this->name = name;
}

Author::Author(Author* author) {
    this->name = author->name;
    this->surname = author->surname;
}

void Author::accept(IVisitor* v) {
    v->visitAuthor(this);
}

std::string Author::getName() {
    return this->name + " " + this->surname;
}