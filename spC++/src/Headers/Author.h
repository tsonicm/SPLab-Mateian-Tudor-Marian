#include <iostream>
#include <string>

class Author {
private:
    std::string name, surname;
public:
    Author(std::string name, std::string surname);
    Author(std::string name);
    void print();
};