#pragma once

#include "IElement.hpp"
#include "Visitee.hpp"

class Section : public IElement, public Visitee {
protected:
    std::string title;
public:
    Section(std::string title);
    Section(Section* section);
    IElement *clone() override;
    void accept(IVisitor* v) override;
    std::string getTitle();
};