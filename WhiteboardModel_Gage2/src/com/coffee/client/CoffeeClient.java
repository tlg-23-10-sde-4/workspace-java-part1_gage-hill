package com.coffee.client;

import com.coffee.Coffee;
import com.coffee.CoffeeType;
import com.coffee.Roast;
import com.coffee.Size;

public class CoffeeClient {
    public static void main(String[] args) throws IllegalArgumentException {
        Coffee coffee1 = new Coffee(CoffeeType.ESPRESSO, Roast.DARK, Size.MEDIUM, 3.25);
        Coffee coffee2 = new Coffee(CoffeeType.CAPPUCCINO, Roast.LIGHT, Size.SMALL, 1.25);

        System.out.println("Order 1:");
        coffee1.confirmingOrder();
        System.out.println(coffee1.toString());


        System.out.println("Order 2:");
        coffee2.confirmingOrder();
        System.out.println(coffee2.toString());
    }
}