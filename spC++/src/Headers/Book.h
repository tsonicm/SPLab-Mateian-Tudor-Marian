#include "Section.h"

class Book : public Section {
private:
    std::string title;
public:
    Book(std::string title);
    void print();
    void add(IElement* element);
    void remove(IElement* element);
    std::list<IElement*> getChildren();
};