#pragma once

#include "IElement.hpp"
#include "Visitee.hpp"

class Table : public IElement, public Visitee {
private:
    std::string title;
public:
    Table(std::string title);
    Table(Table* table);
    IElement *clone() override;
    void accept(IVisitor* v) override;
    std::string getTitle();
};