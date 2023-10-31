package wut.sp.Interfaces;

import java.util.List;
import java.util.ArrayList;

public abstract class IElement {
    protected List<IElement> elementList;
    
    public IElement() {
        this.elementList = new ArrayList<IElement>();
    }

    public void add(IElement element) {
        this.elementList.add(element);
    }

    public void remove(IElement element) {
        this.elementList.remove(element);
    }

    public IElement get(int index) {
        return this.elementList.get(index);
    }

    public abstract void print();
    public abstract IElement clone();
}
