#include "Headers/Models/TableOfContents.hpp"

TableOfContents::TableOfContents(TableOfContents* toc) {
    this->entries = toc->entries;
}

void TableOfContents::accept(IVisitor* v) {
    v->visitToC(this);
}

void TableOfContents::addEntry(std::string entry) {
    this->entries.push_back(entry);
}

IElement *TableOfContents::clone() {
    return new TableOfContents(this);
}

std::vector<std::string> TableOfContents::getEntries() {
    return this->entries;
}