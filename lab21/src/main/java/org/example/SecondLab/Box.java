package org.example.SecondLab;

public interface Box<T> {
    T open();
    void put(T item);


    T removeFromBox();
}
