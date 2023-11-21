#pragma once

#include <string>

class IPicture {
    public:
        virtual std::string getUrl() = 0;
};