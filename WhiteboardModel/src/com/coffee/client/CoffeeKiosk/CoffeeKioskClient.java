package com.coffee.client.CoffeeKiosk;

import com.coffee.CoffeeKiosk.CoffeeKiosk;

public class CoffeeKioskClient {
    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk1 = new CoffeeKiosk("Espresso", "Dark", "Medium", 3.55);

        CoffeeKiosk coffeeKiosk2 = new CoffeeKiosk("Cappuccino", "Light", "Medium", 1.25);

        System.out.println(coffeeKiosk1.toString());

        System.out.println(coffeeKiosk2.toString());
    }
}