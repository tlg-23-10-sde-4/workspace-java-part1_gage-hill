package com.coffee.test;

import com.coffee.Coffee;
import com.coffee.CoffeeType;
import com.coffee.Roast;
import com.coffee.Size;

class CoffeeValidationTest {

    public static void main(String[] args) {
        testValidCoffee();
        testInvalidCoffee();
    }

    private static void testValidCoffee() {
        try {
            Coffee coffee = new Coffee(CoffeeType.ESPRESSO, Roast.DARK, Size.MEDIUM, 3.55);
            coffee.confirmingOrder();
            System.out.println(coffee.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Test for valid coffee failed: " + e);
        }
    }

    private static void testInvalidCoffee() {
        try {
            Coffee coffee = new Coffee(null, null, null, -5.00);
            coffee.confirmingOrder();
            System.out.println(coffee.toString());
        }
        catch (IllegalArgumentException e) {
            System.out.println("Test for invalid coffee succeeded: " + e);
        }
    }
}