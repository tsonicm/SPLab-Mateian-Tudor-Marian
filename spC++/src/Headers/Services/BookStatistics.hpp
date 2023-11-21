#pragma once

#include "../Models/IVisitor.hpp"

class BookStatistics: public IVisitor {
    private:
        int NoImages = 0,
         NoTables = 0, 
         NoParagraphs = 0;
    public:
        void visitBook(Book* book) override;
        void visitSection(Section* section) override;
        void visitToC(TableOfContents* tableOfContents) override;
        void visitParagraph(Paragraph* paragraph) override;
        void visitIProxy(ImageProxy* imageProxy) override;
        void visitImage(Image* image) override;
        void visitTable(Table* table) override;
        void visitAuthor(Author* author) override;
        void printStatistics();
};