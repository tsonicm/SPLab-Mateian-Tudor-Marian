#include "IElement.h"
#include "Picture.h"

class Image: public IElement, public Picture {
private:
    std::string url;
    std::string imgContent;

public:
    Image(std::string url);
    Image(Image* image);
    void print();
    IElement *clone();
    std::string getUrl();
};