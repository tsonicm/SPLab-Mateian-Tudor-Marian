#include "Headers/Models/Table.hpp"

Table::Table(std::string title) {
    this->title = title;
}

Table::Table(Table* table) {
    this->title = table->title;
    this->children = table->children;
}

IElement *Table::clone() {
    return new Table(this);
}

void Table::accept(IVisitor* v) {
    v->visitTable(this);
}

std::string Table::getTitle() {
    return this->title;
}