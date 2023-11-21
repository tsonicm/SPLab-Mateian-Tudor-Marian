#pragma once

#include <string>

class AlignStrategy {
public:
    virtual void render(std::string text) = 0;
};