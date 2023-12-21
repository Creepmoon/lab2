package org.example.SecondLab;

public class Boxes <T> implements Box{

    T T;
    @Override
    public Object open() {
        return T;
    }

    @Override
    public void put(Object t) {
        this.T = (T) t;
    }

    @Override
    public Object removeFromBox() {
        T object = T;
        T=null;
        return object;
    }
}
