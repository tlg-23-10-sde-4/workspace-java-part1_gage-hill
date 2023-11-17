package com.entertainment;

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