#include "IElement.h"
#include "Picture.h"
#include "Image.h"

class ImageProxy : public IElement, public Picture
{
private:
    Image *image;
    std::string url;
public:
    ImageProxy(/* args */);
    ~ImageProxy();
};