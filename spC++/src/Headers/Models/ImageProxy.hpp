#pragma once

#include "IElement.hpp"
#include "IPicture.hpp"
#include "Image.hpp"
#include "Visitee.hpp"

class ImageProxy : public IElement, public IPicture, public Visitee
{
private:
    Image *image;
    std::string url;
public:
    ImageProxy(std::string url);
    IElement *clone() override;
    std::string getUrl();
    Image loadImage();
    void accept(IVisitor* v) override;
};