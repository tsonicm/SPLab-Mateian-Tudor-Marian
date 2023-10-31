#include "IElement.h"

class TableOfContents : public IElement {
public:
    TableOfContents();
    void print();
    void add(IElement* element);
    void remove(IElement* element);
    std::list<IElement*> getChildren();
};