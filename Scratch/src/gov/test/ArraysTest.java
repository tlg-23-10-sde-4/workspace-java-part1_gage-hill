package gov.test;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[4]; // length of reference "ages"
        ages[0] = 27;
        ages[1] = 7;
        ages[2] = 3;

        for (int age : ages) {
            System.out.printf("The age is: %s\n", age);
        }
        System.out.printf("This array has %s values\n", ages.length); // returns the length of the array

        System.out.println(ages); // to print and object reference - toString() is automatically called
        System.out.println();

        double[] temps = {63.3, 88.0, 73.0, 66.2, 70.0};

        for (double temp : temps) {
            System.out.printf("The current temperature is: %s\n", temp);
        }
        System.out.println(temps);
        System.out.println();
    }
}