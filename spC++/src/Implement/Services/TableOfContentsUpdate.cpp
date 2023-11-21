#include "Headers/Services/TableOfContentsUpdate.hpp"

void TableOfContentsUpdate::visitBook(Book *book) {
    for (Visitee* element: book->getChildren()) {
        element->accept(this);
    }
}

void TableOfContentsUpdate::visitSection(Section *section) {
    tableOfContents->addEntry(section->getTitle());
    for (IElement* element: section->getChildren()) {
        element->accept(this);
    }
}

void TableOfContentsUpdate::visitToC(TableOfContents *tableOfContents) {
    std::cout << "";
}

void TableOfContentsUpdate::visitParagraph(Paragraph *paragraph) {
    tableOfContents->addEntry(nullptr);
}

void TableOfContentsUpdate::visitIProxy(ImageProxy *imageProxy) {
    imageProxy->loadImage().accept(this);
}

void TableOfContentsUpdate::visitImage(Image *image) {
    tableOfContents->addEntry(nullptr);
}

void TableOfContentsUpdate::visitTable(Table *table) {
    tableOfContents->addEntry(nullptr);
}

void TableOfContentsUpdate::visitAuthor(Author *author) {
    return;
}