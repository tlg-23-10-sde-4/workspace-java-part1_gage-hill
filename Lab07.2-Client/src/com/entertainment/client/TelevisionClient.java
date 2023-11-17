package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;
import com.entertainment.util.Useful;
// import com.entertainment.util.Useful; // this is not visible cannot use
class TelevisionClient {
    // starting point for a standalone Java application
    public static void main(String[] args) {
        // Useful is a public class in another package - good, because I need to use it here
        Useful.help();

        System.out.println(Television.getInstanceCount() + " instances created");
        System.out.println();

        // create an instance of com.entertainment.Television, set its properties, then call methods on it
        // here, we use the no-arg ctor and set the properties individually, via the setters
        Television tv1 = new Television();
        tv1.setBrand(Television.Brand.valueOf("Samsung"));
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.OLED);
        operateTelevision(tv1);

        // second instance of 'Television'
        // use the 3-arg brand-volume-display constructor
        Television tv2 = new Television(Television.Brand.SONY, 50, DisplayType.PLASMA);
        tv2.turnOn();
        tv2.turnOff();
        operateTelevision(tv2);

        // third instance of 'Television'
        // use the 1-arg brand constructor - volume will default to 0 and display to LED
        Television tv3 = new Television(Television.Brand.LG);
        System.out.println();
        operateTelevision(tv3);

        System.out.println(Television.getInstanceCount() + " instances created");
    }

    // helper method to operate and display information about a Television
    public static void operateTelevision(Television tv) {
        tv.turnOn();
        tv.turnOff();
        System.out.println(tv);
        System.out.println();
    }
}