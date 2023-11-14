#include "../Headers/Section.h"
#include "../Headers/Paragraph.h"
#include "../Headers/IVisitor.h"

Section::Section(std::string title) {
    this->title = title;
    IElement::children = std::list<IElement*>();
}

Section::Section(Section* section) {
    this->title = section->title;
    IElement::children = std::list<IElement*>(section->children);
}

void Section::print() {
    std::cout << "Section: " << title << std::endl;
    for (IElement* element : IElement::children) {
        element->print();
    }
}

IElement* Section::clone() {
    return new Section(this);
}

void Section::accept(IElement* visitee) {
    visitee->visit(this);
}