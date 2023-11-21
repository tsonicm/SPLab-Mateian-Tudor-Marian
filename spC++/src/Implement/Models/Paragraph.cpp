#include "Headers/Models/Paragraph.hpp"

Paragraph::Paragraph(std::string text) {
    this->text = text;
}

Paragraph::Paragraph(Paragraph* paragraph) {
    this->text = paragraph->text;
}

IElement *Paragraph::clone() {
    return new Paragraph(this);
}

void Paragraph::accept(IVisitor* v) {
    v->visitParagraph(this);
}

std::string Paragraph::getText() {
    return this->text;
}