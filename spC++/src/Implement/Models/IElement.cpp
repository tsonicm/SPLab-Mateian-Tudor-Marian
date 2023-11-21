#include "../../Headers/Models/IElement.hpp"


void IElement::add(IElement* element) {
    this->children.push_back(element);
}

void IElement::remove(IElement* element) {
    this->children.remove(element);
}

IElement* IElement::get(int index) {
    std::list<IElement*>::iterator it = this->children.begin();
    std::advance(it, index);
    return *it;
}

std::list<IElement*> IElement::getChildren() {
    return this->children;
}