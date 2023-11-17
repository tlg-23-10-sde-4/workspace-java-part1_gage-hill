class Television {
    // static variables - shared among all instances, can only touch other static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    private static int instanceCount = 0; // tracks the number of instances created

    // Enum for valid brands
    public enum Brand {
        SAMSUNG,
        SONY,
        LG,
        TOSHIBA
    }

    // instance fields (attributes, properties)
    private Brand brand;
    private int volume;
    private DisplayType display;
    private boolean isMuted;
    private int oldVolume; // for managing mute state

    // constructors
    // instanceCount = instanceCount + 1
    public Television() {
        instanceCount++;
    }

    public Television(Brand brand) {
        this();
        this.brand = brand;
    }

    public Television(Brand brand, int volume, DisplayType display) {
        this(brand); // use 'this' when there are overlapping parameters
        setVolume(volume);
        this.display = display;
    }

    // 'static' method
    public static int getInstanceCount() {
        return instanceCount;
    }

    // business 'action' methods aka functions or operations
    // What do Television 'objects' do?
    // 'if/else' volume rang checking validation
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
        if (verifyInternetConnection()) {
            System.out.println("Turning on your " + this.brand + " TV to volume " + this.volume);
        }
        else {
            System.out.println("Failed to turn on TV: No internet connection.");
        }
    }

    public void turnOff() {
        System.out.println("Shutting off... goodbye.");
    }

    // accessor methods - provide 'controlled access' to the object's fields
    public boolean isMuted() {
        return isMuted;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
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

    // provides a string representation of 'Television' object
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(volume);
        return String.format("Television: brand=%s, volume=%s, display=%s", getBrand(), volumeString, getDisplay());
    }
}