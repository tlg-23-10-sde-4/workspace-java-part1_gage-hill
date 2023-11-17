class Television {
    // static variables - shared among all instances, can only touch other static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "Sony", "LG", "Toshiba" }; // DO NOT do it like this, use 'Enum' className
    private static int instanceCount = 0; // tracks the number of instances created

    // instance fields (attributes, properties)
    private String brand; // default value for when client doesn't specify a value
    private int volume;
    private DisplayType display = DisplayType.LED; // = DisplayType.LED is initialized meaning any new 'Television' object will have its display type set to 'LED'
    private boolean isMuted;
    private int oldVolume; // completely hidden, no get/set methods

    // constructors
    // instanceCount = instanceCount + 1
    public Television() {
        instanceCount++;
    }

    public Television(String brand, int volume, DisplayType display) {
        this.setBrand(brand); // use 'this' when there are overlapping parameters
        setVolume(volume);
    }

    // 'static' method
    public static int getInstanceCount() {
        return instanceCount;
    }

    // business 'action' methods aka functions or operations
    // What do Television 'objects' do?
    public void mute() {
        if (!isMuted) { // not currently muted
            oldVolume = getVolume();
            setVolume(MIN_VOLUME);
            isMuted = true;
        }
        else {          // we are currently muted, so restore the volume from oldVolume
            setVolume(oldVolume); // back to 32
            isMuted = false;
        }
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + this.brand + " TV to volume " + this.volume);
    }

    public void turnOff() {
        System.out.println("Shutting off... goodbye.");
    }

    // accessor methods - provide 'controlled access' to the object's fields
    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME  <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;// set the volume only if it's within the valid range
            isMuted = false; // automatically unmuted
        }
        else {
            System.out.printf("Invalid volume: %s. Must be between %s and %s.\n", volume, MIN_VOLUME, MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    private boolean verifyInternetConnection() {
        // placeholder for method that would check internet connectivity
        return true;
    }

    // toString method
    // provides a string representation of 'Television' object
    @Override
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return String.format("Television: brand=%s, volume=%s, display=%s", getBrand(), volumeString, getDisplay());
    }
}