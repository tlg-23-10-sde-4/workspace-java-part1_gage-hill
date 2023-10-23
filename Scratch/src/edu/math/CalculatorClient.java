package edu.math;

import static edu.math.Calculator.*; // it is OK to use * for static imports

class CalculatorClient {

    public static void main(String[] args) {

        // doubles are passed where doubles are expected
        double sum = add(3.1, 5.1);
        System.out.println("The sum is " + sum);

        // method inlining, it's okay to pass ints where doubles are expected in the subtract() method
        // at runtime, an implicit upcast is done, converting the ints to doubles
        System.out.println("The difference is " + subtract(3, 5)); // "Calculator was removed because of the static import .Calculator.*

        System.out.println("The average is: " + Calculator.average(3, 4, 9)); // can pass in any number of lose "ints"

        System.out.println("10 is even? " + Calculator.isEven(10));

        System.out.println("The average is: " + Calculator.average(3, 4, 5, 9, 15));
        System.out.println();

        int min = 5;
        int max = 20;
        boolean itWorks = true;
        int result = 0;

        // iterate 1_000_000 times, calling this method and checking the result against min, max
        for (int i = 0; i < 10_000_000; i++) {
            result = Calculator.randomInt(min, max);

            if (result < min || result > max) {
                itWorks = false;
                break;
            }
        }
        
        if (itWorks) {
            System.out.println("Congratulations");
        }
        else {
            System.out.println("Bug");
            System.out.println("The value returned is: " + result);
        }
    }
}