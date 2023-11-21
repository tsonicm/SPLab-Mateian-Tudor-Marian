#include "Headers/Models/Image.hpp"
#include <unistd.h>

Image::Image(std::string imgName) {
    this->imageName = imgName;
}

Image::Image(Image* image) {
    this->imageName = image->imageName;
}

IElement *Image::add(IElement *element) {
    throw std::runtime_error("Cannot add element to image");
}

IElement *Image::remove(IElement *element) {
    throw std::runtime_error("Cannot remove element from image");
}

IElement *Image::get(int index) {
    throw std::runtime_error("Cannot get element from image");
}

IElement *Image::clone() {
    return new Image(this);
}

void Image::accept(IVisitor* v) {
    v->visitImage(this);
}

std::string Image::getImageName() {
    return this->imageName;
}