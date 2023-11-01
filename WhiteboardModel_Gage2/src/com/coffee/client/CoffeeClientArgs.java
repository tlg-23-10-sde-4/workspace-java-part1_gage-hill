package com.coffee.client;

import com.coffee.Coffee;
import com.coffee.CoffeeType;
import com.coffee.Roast;
import com.coffee.Size;

class CoffeeClientArgs {

    public static void main(String[] args) {
        if (args.length <= 4) {
            printUsage();
            return;
        }

        String coffeeType = args[0];
        String roast = args[1];
        String size = args[2];
        double price = Double.parseDouble(args[3]);

        try {
            Coffee coffee = new Coffee(CoffeeType.valueOf(coffeeType.toLowerCase()), Roast.valueOf(roast.toLowerCase()), Size.valueOf(size.toLowerCase()), price);
            coffee.confirmingOrder();
            System.out.println(coffee.toString());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid data: " + e);
        }
    }

    private static void printUsage() {

        String usage = "Usage: java CoffeeClientArgs <coffeeType> <roast> <size> <price>";
        String example = "Example: java CoffeeArgs Espresso Dark Medium 3.55";
        String note1 = "Valid coffee types are Espresso, Cappuccino, and Iced.";
        String note2 = "Valid roasts are Light, Medium, and Dark.";
        String note3 = "Valid sizes are Small, Medium, and Large.";
        String note4 = "Price must be a positive value.";

        System.out.println(usage);
        System.out.println(example);
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
        System.out.println(note4);
    }
}