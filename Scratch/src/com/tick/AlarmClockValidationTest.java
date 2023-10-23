package com.tick;

/*
 * Client-side main-class focused on validation testing.
 * BVT (Boundary Value Testing) - we test on the boundaries and just outside them.
 * 0,1, and 20,21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();

        clock.setSnoozeInterval(1); // no error, value should "stick" (accepted)
        System.out.println(clock.toString());

        clock.setSnoozeInterval(20);
        System.out.println(clock.toString());

        clock.setSnoozeInterval(0);
        System.out.println(clock.toString());

        clock.setSnoozeInterval(21);
        System.out.println(clock.toString());
    }
}