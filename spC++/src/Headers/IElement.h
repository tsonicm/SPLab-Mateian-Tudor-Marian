#include <iostream>
#include <string>
#include <list>
#pragma once
class IElement {
protected:
    std::list<IElement*> children;

public:
    virtual void print() = 0;
    virtual IElement *clone() = 0;
    void add(IElement* element);
    void remove(IElement* element);
    std::list<IElement*> get(int index);
    virtual ~IElement() {}
};