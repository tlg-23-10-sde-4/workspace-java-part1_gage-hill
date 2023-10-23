package gov.test;

class IncrementTest {

    public static void main(String[] args) {
        int i = 3;
        System.out.println(i);

        System.out.println(++i); // pre-increment "++i+", post-increment "i++" - prints "i" then increments
        System.out.println();

        int x = 18;
        int y = x;

        System.out.println(x++);
        System.out.println(y);
    }
}