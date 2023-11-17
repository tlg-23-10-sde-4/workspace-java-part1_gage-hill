class TelevisionClient {
    // application starting point - at runtime, the app starts here
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        System.out.println();

        // create an instance of Television and set its properties
        Television tv1 = new Television();
        tv1.setBrand(Television.Brand.SAMSUNG); // using Enum for brand
        tv1.setVolume(32);
        tv1.setDisplay(DisplayType.PLASMA);

        // create a 2nd instance of Television via the brand-volume ctor call
        Television tv2 = new Television(Television.Brand.SAMSUNG, Television.MAX_VOLUME, DisplayType.OLED);

        // create a 3rd instance object by specifying only the brand in the ctor call
        Television tv3 = new Television(Television.Brand.SONY);

        // call methods on tv1
        tv1.turnOn();
        tv1.mute(); // testing mute functionality
        System.out.println(tv1);
        tv1.mute(); // unmute
        tv1.turnOff();
        System.out.println();

        // call methods to tv2
        tv2.turnOn();
        tv2.turnOff();
        System.out.println();

        // call methods to tv3
        tv3.turnOn();
        tv3.turnOff();
        System.out.println();

        // display the state of each TV
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println();
        System.out.println(Television.getInstanceCount() + " instances"); // prints the total number of 'Television' instances created
    }
}
/*
 * Application main-class, i.e., the class definition with the main() method.
 * Purpose: create a few instances of Television and give them a test drive.
 */
