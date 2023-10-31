#include "../Headers/Image.h"
#include <unistd.h>

Image::Image(std::string url) {
    this->url = url;
    try {
        sleep(5);
    } catch (const std::exception& e) {
        std::cerr << e.what() << '\n';
    }
}

Image::Image(Image* image) {
    this->url = image->url;
}

void Image::print() {
    std::cout << "Image: " << url << std::endl;
}

IElement *Image::clone() {
    return new Image(this);
}

std::string Image::getUrl() {
    return url;
}