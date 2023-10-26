package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.InvalidBrandException;
import com.entertainment.Television;

import java.util.Arrays;
import java.util.Locale;

class TelevisionClientArgs {

    public static void main(String[] args) {
        if (args.length < 3) {
            printUsage();
            return;
        }

        String brand = null;
        int volume = 0;
        DisplayType display = null;
        try {
            brand = args[0];
            volume = Integer.parseInt(args[1]);
            display = DisplayType.valueOf(args[2].toUpperCase());
        }
        catch (IllegalArgumentException e) {
            System.out.println("There is a problem with your inputs:");
            System.out.printf("You entered %s %s %s\n", args[0], args[1], args[2]);
            return;
        }
        try {
            Television tv = new Television(brand, volume, display);

            System.out.println("Congratulations on your order, it will be there soon");
            System.out.println(tv);
        }
        catch (Exception e) {
            System.out.println(e.getMessage()); // extracts the thrower's reason string
            printUsage();
        }
    }

    private static void printUsage() {
        String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
        String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
        String note1 = "VALID_BRANDS are" + Arrays.toString(Television.VALID_BRANDS);
        String note2 = String.format("Volume must be between %s to %s", Television.MIN_VOLUME, Television.MAX_VOLUME);
        String note3 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
        System.out.println(usage);
        System.out.println(example);
        System.out.println(note1);
        System.out.println(note2);
        System.out.println(note3);
    }
}