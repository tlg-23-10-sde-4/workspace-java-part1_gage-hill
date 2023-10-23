package gov.test;/*
 * This is used to convert string to int.
 */

class WrappersTest {

    public static void main(String[] args) {
        // integer(primitive) - Integer(object)
        String ageInput = "27"; // constructor
        int age = Integer.parseInt(ageInput);

        Integer ageInteger = Integer.valueOf(ageInput); // static method

        // long(primitive) - Long(object)
        String brainCellsInput = "86000000000";
        long brainCells = Long.parseLong(brainCellsInput);

        Long brainCellsLong = Long.valueOf(brainCellsInput);

        // double(primitive) - Double(object)
        String shoeSizeInput = "10";
        double showSize = Double.parseDouble(shoeSizeInput);

        Double showSizeDouble = Double.valueOf(shoeSizeInput);

        // boolean(primitive) - Boolean(object)
        String sunnyInput = "true";
         boolean sunny = Boolean.parseBoolean(sunnyInput);

         Boolean sunnyInputBoolean = Boolean.valueOf(sunnyInput);

         Integer size = 9; // primitive "auto-boxed" into wrapper object
    }
}