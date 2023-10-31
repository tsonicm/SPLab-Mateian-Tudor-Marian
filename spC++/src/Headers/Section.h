#include "IElement.h"

class Section : public IElement {
protected:
    std::string title;
public:
    Section(std::string title);
    Section(Section* section);
    void print();
    IElement *clone();
};