#include "IElement.h"
#include "IPicture.h"

class Image: public IElement, public IPicture {
private:
    std::string url;
    std::string imgContent;

public:
    Image(std::string url);
    Image(Image* image);
    void print() override;
    IElement *clone() override;
    std::string getUrl();
};