#pragma once

#include "IElement.hpp"
#include "Visitee.hpp"
#include <vector>
#include <string>

class TableOfContents : public IElement, public Visitee {
private:
    static std::vector<std::string> entries;
public:
    TableOfContents(TableOfContents* tableOfContents);
    void add(IElement* element);
    void remove(IElement* element);
    IElement* clone() override;
    std::list<IElement*> getChildren();
    void accept(IVisitor* visitor) override;
    void addEntry(std::string entry);
    std::vector<std::string> getEntries();
};