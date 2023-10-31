#include "IElement.h"
#include "AlignStrategy.h"
#pragma once

class Paragraph : public IElement {
private:
    std::string text;
    AlignStrategy *alignStrategy;
public:
    Paragraph(std::string text);
    Paragraph(Paragraph* paragraph);
    void print() override;
    IElement *clone() override;
    void setAlignStrategy(AlignStrategy *alignStrategy);
};