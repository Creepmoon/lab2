package org.example.SecondLab;

public class BeerBox implements Box{

    Beer beer = new Beer();

    @Override
    public Object open() {
        return beer;
    }

    @Override
    public void put(Object item) {
        if(item.getClass().equals(Beer.class))
            this.beer = (Beer) item;
    }

    @Override
    public Object removeFromBox() {
        Beer BeerBuffer = beer;
        beer =null;
        return beer;
    }
}
