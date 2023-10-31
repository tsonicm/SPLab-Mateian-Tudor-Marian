#include <string>
#pragma once

class AlignStrategy {
public:
    virtual void render(std::string text) = 0;
};