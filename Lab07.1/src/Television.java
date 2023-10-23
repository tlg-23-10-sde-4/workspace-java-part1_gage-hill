/*
 * Business class to model the workings of a television.
 */
public class Television {
    // static variables - shared among all instances, can only touch other static variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = { "Samsung", "Sony", "LG", "Toshiba" }; // DO NOT do it like this, use enum className

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // fields - attributes, properties
    private String brand;   // default value for when client doesn't specify a value
    private int volume;
    private DisplayType display = DisplayType.LED;

    // these are for muting behavior
    private boolean isMuted; // provide a getter, only
    private int oldVolume; // completely hidden, no get/set methods

    // constructors
    public Television() {
        instanceCount++; // instanceCount = instanceCount + 1
    }

    public Television(String brand) {
    }

    public Television(String brand, int volume, DisplayType display) {
        this.setBrand(brand); // use "this" when there are overlapping parameters
        setVolume(volume);
    }

    // business "action" methods aka functions or operations
    // What do Television objects do?
    public void mute() {
        if (!isMuted) { // not currently muted
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        }
        else {         // we are currently muted, so restore the volume from oldVolume
            setVolume(oldVolume); // back to 32
            isMuted = false;
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + ", TV to volume " + getVolume());
    }

    public void turnOff() {
        System.out.println("Shutting down... goodbye.");
    }

    // accessor methods - provide "controlled access" to the object's fields
    public boolean isMuted() {
        return isMuted;
    }

    public String getBrand() {
        return brand;
    }

    public String setBrand(String brand) {
        return this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (MIN_VOLUME  <= volume && volume <= MAX_VOLUME) {
            this.volume = volume;// Set the volume only if it's within the valid range
            isMuted = false; // automatically unmuted
        } else {
            System.out.printf("Invalid volume: %s. Must be between %s and %s.|n", volume, MIN_VOLUME, MAX_VOLUME);

            // System.out.println("Invalid volume: " + volume + ". " + "Valid range is [" + MIN_VOLUME + " - " + MAX_VOLUME + "].");
        }
    }

    private boolean verifyInternetConnection() {
        return true; // this is a fake implementation
    }

    // toString()
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());

        return String.format("Television: brand=%s, volume=%s, display=%s", getBrand(), volumeString, getDisplay());

        // "Television brand = " + getBrand() + ", volume " + volumeString + " Display: " + getDisplay();
    }
}
