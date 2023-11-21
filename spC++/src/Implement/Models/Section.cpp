#include "Headers/Models/Section.hpp"

Section::Section(std::string title) {
    this->title = title;
}

Section::Section(Section* section) {
    this->title = section->title;
    this->children = section->children;
}

IElement *Section::clone() {
    return new Section(this);
}

void Section::accept(IVisitor* v) {
    v->visitSection(this);
}

std::string Section::getTitle() {
    return this->title;
}