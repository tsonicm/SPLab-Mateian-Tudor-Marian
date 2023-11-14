#include "IElement.h"
#include "IPicture.h"
#include "Image.h"

class ImageProxy : public IElement, public IPicture
{
private:
    Image *image;
    std::string url;
public:
    ImageProxy(std::string url);
    ImageProxy(ImageProxy* imageProxy);
    void print() override;
    IElement *clone() override;
    std::string getUrl();
    ~ImageProxy();
    Image loadImage();
};