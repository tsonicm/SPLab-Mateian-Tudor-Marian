#pragma once

#include "Author.hpp"
#include "Book.hpp"
#include "Section.hpp"
#include "Paragraph.hpp"
#include "TableOfContents.hpp"
#include "ImageProxy.hpp"
#include "Image.hpp"
#include "Table.hpp"

class IVisitor {
public:
    virtual void visitBook(Book *book) = 0;
    virtual void visitSection(Section *section) = 0;
    virtual void visitToC(TableOfContents *tableOfContents) = 0;        
    virtual void visitParagraph(Paragraph *paragraph) = 0;
    virtual void visitIProxy(ImageProxy *imageProxy) = 0;
    virtual void visitImage(Image *image) = 0;
    virtual void visitTable(Table *table) = 0;
    virtual void visitAuthor(Author *author) = 0;
};