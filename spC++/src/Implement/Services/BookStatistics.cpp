#include "Headers/Services/BookStatistics.hpp"

void BookStatistics::visitBook(Book* book) {
    for (Visitee* element : book->getChildren()) {
        element->accept(this);
    }
}

void BookStatistics::visitSection(Section* section) {
    for (IElement* element : section->getChildren()) {
        element->accept(this);
    }
}

void BookStatistics::visitToC(TableOfContents* tableOfContents) {
    return ;
}

void BookStatistics::visitParagraph(Paragraph* paragraph) {
    this->NoParagraphs++;
}

void BookStatistics::visitIProxy(ImageProxy* imageProxy) {
    imageProxy->loadImage().accept(this);
}

void BookStatistics::visitImage(Image* image) {
    this->NoImages++;
}

void BookStatistics::visitTable(Table* table) {
    this->NoTables++;
}

void BookStatistics::visitAuthor(Author* author) {
    return ;
}

void BookStatistics::printStatistics() {
    std::cout << "Book statistics: " << std::endl << std::endl;
    std::cout << "Number of images: " << this->NoImages << std::endl;
    std::cout << "Number of tables: " << this->NoTables << std::endl;
    std::cout << "Number of paragraphs: " << this->NoParagraphs << std::endl;
}