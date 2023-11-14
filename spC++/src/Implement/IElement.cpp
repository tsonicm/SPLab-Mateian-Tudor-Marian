#include "../Headers/IElement.h"

void IElement::add(IElement* element) {
    children.push_back(element);
}

void IElement::remove(IElement* element) {
    children.remove(element);
}

std::list<IElement*> IElement::get(int index) {
    std::list<IElement*> result;
    for (IElement* element : children) {
        result.push_back(element);
    }
    return result;
}

void *IElement::accept(IElement *visitee) {
    return visitee->accept(this);
}