#pragma once

#include <iostream>
#include <string>
#include <list>
#include "Visitee.hpp"

class IElement: public Visitee {
protected:
    std::list<IElement*> children;

public:
    virtual IElement *clone() = 0;
    void add(IElement* element);
    void remove(IElement* element);
    IElement* get(int index);
    virtual ~IElement();
    std::list<IElement*> getChildren();
};