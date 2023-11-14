#pragma once

#include "Book.h"
#include "Section.h"
#include "Paragraph.h"
#include "TableOfContents.h"
#include "ImageProxy.h"
#include "Image.h"
#include "Table.h"

class IVistor
{
public:
    virtual void visit(Book *book) = 0;
    virtual void visit(Section *section) = 0;
    virtual void visit(Paragraph *paragraph) = 0;
    virtual void visit(TableOfContents *tableOfContents) = 0;
    virtual void visit(ImageProxy *imageProxy) = 0;
    virtual void visit(Image *image) = 0;
    virtual void visit(Table *table) = 0;
};