#include "IElement.h"
#include "AlignStrategy.h"

class Paragraph : public IElement {
private:
    const std::string text;
    AlignStrategy *alignStrategy;
public:
    Paragraph(std::string text);
    Paragraph(Paragraph* paragraph);
    void print();
    IElement *clone();
};