#include "Implement/Section.cpp"
#include "Implement/Author.cpp"
#include "Implement/Paragraph.cpp"
#include "Implement/IElement.cpp"


int main() {
    Section cap1 = new Section("Chapter 1");
    Paragraph* p1 = new Paragraph("Paragraph 1");
    cap1.add(p1);
    Paragraph* p2 = new Paragraph("Paragraph 2");
    cap1.add(p2);
    Paragraph* p3 = new Paragraph("Paragraph 3");
    cap1.add(p3);
    Paragraph* p4 = new Paragraph("Paragraph 4");
    cap1.add(p4);
    std::cout << "Print w/o alignment" << std::endl << std::endl;
    cap1.print();
    
    std::cout << std::endl << "Print with alignment" << std::endl << std::endl;
    p1->setAlignStrategy(new AlignCenter());
    p2->setAlignStrategy(new AlignRight());
    p3->setAlignStrategy(new AlignLeft());

    cap1.print();
}