package com.helloit.fruitbasket.main;

import org.junit.Assert;
import org.junit.Test;

public class PriceCalculatortest {

    @Test
    public void checkTotalPrice(){

        Fruit banana =  new Fruit("Banana", 100);
        Fruit banana1;

        Basket basket = new Basket();
        basket.addFruit(new Fruit("Apple", 10.2));
        basket.addFruit(new Fruit("Pear", 15.4));
        basket.addFruit(banana);

        banana1 = banana;
        banana1.setPrice(200);

        PriceCalculator calculator = new PriceCalculator();
        double price = calculator.calculateTotalPrice(basket);

        Assert.assertEquals("calculate test", 225.6, price, 0.0);
    }
}
