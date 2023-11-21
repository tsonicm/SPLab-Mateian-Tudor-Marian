#include "Headers/Models/ImageProxy.hpp"

ImageProxy::ImageProxy(std::string url) {
    this->url = url;
}

IElement *ImageProxy::clone() {
    return nullptr;
}

std::string ImageProxy::getUrl() {
    return this->url;
}

Image ImageProxy::loadImage() {
    if (this->image == nullptr)
        this->image = new Image(this->url);
    
    return *this->image;
}

void ImageProxy::accept(IVisitor* v) {
    v->visitIProxy(this);
}