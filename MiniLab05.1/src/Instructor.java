class Instructor {
    public void doubleIt(int value) {
        value *= 2;  // value = value * 2
        System.out.println("Instructor: I have doubled the value to now be:  " + value);
    }

    public void writeOnBoard(Marker marker, String message) {
        marker.setColor("blue");  // HA!  Whatever it was before, it's blue now!
        System.out.println("Instructor: writing " + message + " on the board.");
    }
}
/*
 * doubleIt() method demonstrates how Java handles primitive data types in methods
 * 'int value' - primitive data type
 *
 * writeOnBoard() method demonstrates how Java handles object references in methods
 * changes the color of the 'Marker' object
 */