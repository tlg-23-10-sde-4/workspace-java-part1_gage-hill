package com.coffee.client.CoffeeKioskArgs;

import com.coffee.CoffeeKiosk.CoffeeKiosk;

class CoffeeKioskClientArgs {

    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage: java CoffeeKioskClientArgs <coffeeType> <roast> <size> <price>";
            String example = "Example: java CoffeeKioskClientArgs Espresso Dark Medium 3.55";
            String note1 = "Valid coffee types are Espresso, Cappuccino, and Iced.";
            String note2 = "Valid roasts are Light, Medium, and Dark.";
            String note3 = "Valid sizes are Small, Medium, and Large.";
            String note4 = "Price must be a positive numeric value.";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            System.out.println(note3);
            System.out.println(note4);
            return;
        }

        String coffeeType = args[0];
        String roast = args[1];
        String size = args[2];
        double price = 0;

        CoffeeKiosk coffeeKiosk = new CoffeeKiosk(coffeeType, roast, size, price);
        
        System.out.println(coffeeKiosk.toString());
    }
}