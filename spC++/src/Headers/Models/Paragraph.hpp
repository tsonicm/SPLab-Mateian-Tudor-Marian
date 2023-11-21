#pragma once

#include "IElement.hpp"
#include "Visitee.hpp"

class Paragraph : public IElement, public Visitee {
private:
    std::string text;
public:
    Paragraph(std::string text);
    Paragraph(Paragraph* paragraph);
    IElement *clone() override;
    void accept(IVisitor* v) override;
    std::string getText();
};