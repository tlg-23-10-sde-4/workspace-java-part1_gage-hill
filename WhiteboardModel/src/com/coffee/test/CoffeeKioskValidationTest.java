package com.coffee.test;

import com.coffee.CoffeeKiosk;

class CoffeeKioskValidationTest {

    public static void main(String[] args) {
        CoffeeKiosk coffeeKiosk1 = new CoffeeKiosk("Espresso", "Dark", "Medium", 3.55);
        System.out.println(coffeeKiosk1.toString());

        CoffeeKiosk coffeeKiosk2 = new CoffeeKiosk("Mocha", "Dark", "Medium", 3.55);
        System.out.println("This is an invalid selection:");
    }


}