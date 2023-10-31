#include "../Headers/Align.h"
#include <iostream>

void AlignLeft::render(std::string text) {
    std::cout << text << "#" << std::endl;
}

void AlignRight::render(std::string text) {
    std::cout << "#" << text << std::endl;
}

void AlignCenter::render(std::string text) {
    std::cout << "#" << text << "#" << std::endl;
}