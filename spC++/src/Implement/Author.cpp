#include "../Headers/Author.h"

Author::Author(std::string name, std::string surname) {
    this->name = name;
    this->surname = surname;
}

Author::Author(std::string name) {
    this->name = name;
    this->surname = "";
}

void Author::print() {
    std::cout << "Author: " << name << " " << surname << std::endl;
}