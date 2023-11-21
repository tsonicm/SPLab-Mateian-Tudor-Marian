#pragma once

#include "../Models/IVisitor.hpp"

class TableOfContentsUpdate : public IVisitor {
    private:
        TableOfContents* tableOfContents;

    public:
        void visitBook(Book* book) override;
        void visitSection(Section* section) override;
        void visitToC(TableOfContents *tableOfContents) override;
        void visitParagraph(Paragraph* paragraph) override;
        void visitIProxy(ImageProxy* imageProxy) override;
        void visitImage(Image* image) override;
        void visitTable(Table* table) override;
        void visitAuthor(Author* author) override;
        TableOfContents getToC();
};