#include "Implement/IElement.cpp"
#include "Implement/Section.cpp"
#include "Implement/Author.cpp"
#include "Implement/Paragraph.cpp"

int main() {
    Section cap1 = new Section("Capitulo 1");
    Paragraph p1 = new Paragraph("Paragrafo 1");
    cap1.add(p1);
    Paragraph p2 = new Paragraph("Paragrafo 2");
    cap1.add(p2);
    Paragraph p3 = new Paragraph("Paragrafo 3");
    cap1.add(p3);
    Paragraph p4 = new Paragraph("Paragrafo 4");
    cap1.add(p4);
    std::cout << "Print w/o alignment" << std::endl;
    cap1.print();
    
}