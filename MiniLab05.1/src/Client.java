class Client {
    public static void main(String[] args) {
        passByValue();
        passByReference();
    }

    private static void passByValue() {
        int x = 4;
        System.out.println("Client: before the call, x is " + x);

        // create Instructor and tell it to double my value
        Instructor instructor = new Instructor();
        instructor.doubleIt(x);

        System.out.println("Client: after the call, x is " + x);
    }

    private static void passByReference() {
        Marker m1 = new Marker("red");
        System.out.println("Client: before the call, the marker is " + m1.getColor());

        // create Instructor and tell it to write on board, with the Marker I pass in
        Instructor instructor = new Instructor();
        instructor.writeOnBoard(m1, "pass by reference");

        System.out.println("Client: after the call, the marker is " + m1.getColor());
    }
}
/*
 * passByValue() method demonstrates pass-by-value with primitive data types
 * the original variable is not passed
 *
 * passByReference() method demonstrates pass-by-reference with an object
 * affect the original copy
 */