#include "IElement.h"

class Table : public IElement {
private:
    std::string title;
public:
    Table(std::string title);
    Table(Table* table);
    void print() override;
    IElement *clone() override;
};