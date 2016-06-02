package com.helloit.fruitbasket.main;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Student on 6/2/2016.
 */
public class FruitTest {
    @Test
    public void checkSetter(){
        Fruit apple = new Fruit("Apple", 10.4);
        apple.setName("Apple1");
        apple.setPrice(11.4);

        Assert.assertEquals("setname", "Apple1", apple.getName());
        Assert.assertEquals("setprice", 11.4, apple.getPrice(), 0.0);

    }

}
