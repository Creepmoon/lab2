package org.example;

import org.example.SecondLab.*;
import org.example.SecondLab.Boxes;

public class Application {
    public static void main(final String[] args) {

        Boxes<Beer>  beerBoxes = new Boxes<Beer>();
        Beer beer= new Beer();
        beer.setName("Baltika");
        beerBoxes.put(beer);

        Boxes<Shoe> shoeBoxes = new Boxes<Shoe>();
        Shoe shoe = new Shoe();
        shoe.setName("VOVA ADIDAS");
        shoeBoxes.put(shoe);




    }
}
