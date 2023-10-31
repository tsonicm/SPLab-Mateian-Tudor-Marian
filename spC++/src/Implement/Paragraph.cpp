#include "../Headers/Paragraph.h"
#include "Align.cpp"

Paragraph::Paragraph(std::string pg) {
    this->text = pg;
    alignStrategy = nullptr;
}

Paragraph::Paragraph(Paragraph* paragraph) {
    this->text = paragraph->text;
}

void Paragraph::print() {
    if(alignStrategy != nullptr) {
        alignStrategy->render(text);
    } else {
        (new AlignLeft())->render(text);
    }
}

IElement* Paragraph::clone() {
    return new Paragraph(this);
}

void Paragraph::setAlignStrategy(AlignStrategy *alignStrategy) {
    this->alignStrategy = alignStrategy;
}