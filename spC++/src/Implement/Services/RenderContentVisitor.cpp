#include "Headers/Services/RenderContentVisitor.hpp"

void RenderContentVisitor::visitSection(Section* section) {
    std::cout << section->getTitle() << std::endl;
    for (auto child : section->getChildren()) {
        child->accept(this);
    }
}

void RenderContentVisitor::visitToC(TableOfContents* tableOfContents) {
    int pageCounter = 0;
    std::cout << "Table of Contents" << std::endl;
    for (std::string entry : tableOfContents->getEntries()) {
        if (entry != "")
            std::cout << entry << " - " << pageCounter+1 << std::endl;
        else 
            pageCounter++;
    }
}

void RenderContentVisitor::visitParagraph(Paragraph* paragraph) {
    std::cout << "Paragraph: " << paragraph->getText() << std::endl;
}

void RenderContentVisitor::visitIProxy(ImageProxy* imageProxy) {
    imageProxy->loadImage().accept(this);
}

void RenderContentVisitor::visitImage(Image* image) {
    std::cout << "Image with name: " << image->getImageName() << std::endl;
}

void RenderContentVisitor::visitTable(Table* table) {
    std::cout << "Table with title: " << table->getTitle() << std::endl;
}

void RenderContentVisitor::visitAuthor(Author* author) {
    std::cout << "Author: " << author->getName() << std::endl;
}

void RenderContentVisitor::visitBook(Book* book) {
    std::cout << "Book: " << book->getTitle() << std::endl << std::endl;
    
    std::cout << "Authors: " << std::endl;
    for (auto author : book->getAuthors()) {
        author.accept(this);
    }

    std::cout << std::endl;

    for (Visitee* element : book->getChildren()) {
        element->accept(this);
    }
}