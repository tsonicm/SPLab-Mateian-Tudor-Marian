#pragma once

#include "IElement.hpp"
#include "Visitee.hpp"

class Image: public IElement, public Visitee {
private:
    std::string imageName;

public:
    Image(std::string imgName);
    Image(Image* image);
    IElement *add(IElement *element);
    IElement *remove(IElement *element);
    IElement *get(int index);
    IElement *clone() override;
    void accept(IVisitor* v) override;
    std::string getImageName();
};