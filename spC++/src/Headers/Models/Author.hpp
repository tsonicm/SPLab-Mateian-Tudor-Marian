#pragma once

#include <iostream>
#include <string>
#include "Visitee.hpp"
#include "IVisitor.hpp"

class Author : public Visitee{
private:
    std::string name, surname;
public:
    Author(std::string name, std::string surname);
    Author(std::string name);
    Author(Author* author);
    void accept(IVisitor* visitor) override;
    std::string getName();
};