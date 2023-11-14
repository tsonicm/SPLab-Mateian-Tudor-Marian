#include "../Headers/ImageProxy.h"

ImageProxy::ImageProxy(std::string url) {
    this->url = url;
    image = nullptr;
}

ImageProxy::ImageProxy(ImageProxy* imageProxy) {
    this->url = imageProxy->url;
    image = nullptr;
}

void ImageProxy::print() {
    if(image == nullptr) {
        image = new Image(url);
    }
    image->print();
}

IElement* ImageProxy::clone() {
    return new ImageProxy(this);
}

std::string ImageProxy::getUrl() {
    return url;
}

ImageProxy::~ImageProxy() {
    delete image;
}

Image ImageProxy::loadImage() {
    if (image == nullptr) {
        image = new Image(url);
    }
    return *image;
}