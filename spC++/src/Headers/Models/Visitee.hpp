#pragma once

#include "IVisitor.hpp"

class Visitee {
public:
    virtual void accept(IVisitor* visitor) = 0;
};