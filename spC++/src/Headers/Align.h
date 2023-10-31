#include "AlignStrategy.h"

class AlignLeft : public AlignStrategy {
public:
    void render(std::string text);
};

class AlignRight : public AlignStrategy {
public:
    void render(std::string text);
};

class AlignCenter : public AlignStrategy {
public:
    void render(std::string text);
};