package wut.sp.Interfaces;

public interface IElement {
    public void print();
    public void add(IElement element);
    public void remove(IElement element);
    public IElement getElement(int index);
}
