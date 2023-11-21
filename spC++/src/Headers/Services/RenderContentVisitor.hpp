#pragma once

#include "../Models/IVisitor.hpp"

class RenderContentVisitor : public IVisitor {
public:
    void visitBook(Book* book) override;
    void visitSection(Section* section) override;
    void visitToC(TableOfContents* tableOfContents) override;
    void visitParagraph(Paragraph* paragraph) override;
    void visitIProxy(ImageProxy* imageProxy) override;
    void visitImage(Image* image) override;
    void visitTable(Table* table) override;
    void visitAuthor(Author* author) override;
};