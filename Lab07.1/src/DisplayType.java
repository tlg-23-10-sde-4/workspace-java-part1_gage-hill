enum DisplayType {
    LED(1920,1080), // these are parameters, parameters are passed to the constructor
    OLED(3840, 2160),
    PLASMA(1280,720),
    LCD(1920,1080),
    CRT(340, 460);

    private final int resolutionWidth;
    private final int resolutionHeight;

    // Enum constructor
    DisplayType(int width, int height) {
        this.resolutionWidth = width;
        this.resolutionHeight = height;
    }

    // Getter methods
    public int getResolutionWidth() { // getter methods retrieve declared values, 'width, height'
        return resolutionWidth;
    }

    public int getResolutionHeight() {
        return resolutionHeight;
    }
}
/*
 * used to define a set of constants
 * there are 5 instances or constants of displayType and each represents a unique type of display
 * reference example: 'DisplayType.LED'
 * can only take one of a limited set of predefined values
 *
 * Advanced Enum Features:
 * _enums can have attributes, methods(private), and CTORs
 * _accessor methods like getter/setter's
 * _'switch' statements are used by Enum's, they execute different code blocks depending on it's value
 */