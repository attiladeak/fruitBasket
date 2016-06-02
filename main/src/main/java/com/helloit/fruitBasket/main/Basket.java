package com.helloit.fruitbasket.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Basket {

    private List<Fruit> fruits;

    public Basket() {
        fruits = new ArrayList<Fruit>();
    }

    public final void addFruit(final Fruit fruit){
        fruits.add(fruit);
    }

    public List<Fruit> getFruits() {
        return Collections.unmodifiableList(fruits);
    }

}


