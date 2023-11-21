package org.example.SecondLab;

public class ShoeBox implements Box{

    Shoe shoe = new Shoe();
    @Override
    public Shoe open() {
        return shoe;
    }

    @Override
    public void put(Object item) {
        if(item.getClass().equals(Shoe.class))
        this.shoe = (Shoe) item;
    }


    @Override
    public Shoe removeFromBox() {
        Shoe shoeBuffer = shoe;
        shoe =null;
        return shoeBuffer;
    }
}
