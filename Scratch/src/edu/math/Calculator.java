package edu.math;

import static java.lang.Math.*;

class Calculator {

    // prevent instantiation from outside, this is an "all-static" class - no fields
    private Calculator() {
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // "double" supports floats
     public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0; // "==" is the comparison, there is no modifier value before the percent sign
    }

    /*
     * Returns a random integer between 1 and 19 (inclusive).
     *
     * HINT: see a class called Math (package java.lang), look for a helpful method here
     * NOTE: the methods in the math class are all "static," which means you call them as: Math.methodName()
     *
     */

    public static int randomInt() {
        // delegate to the min-max version, pass 1 for the min, and 19 for the max
        return randomInt(1,19);
    }

    /*
     * Returns a random integer between "min" and "max" (inclusive).
     * randomIntRange()
     *
     * CHALLENGE: implement this.
     */

    public static int randomInt(int min, int max) {
        double rand = Math.random();
        double scaled = rand * (max - min + 1);
        double raised = scaled + min;
        return (int) raised;
    }

    /*
     * Returns the average (arithmetic mean) of the supplied integers.
     * getAverage()
     * getMean()
     */
    public static double average(int... values) { // inside here, it is actually an array
        double result = 0.0;
        return 0.0;
    }
}