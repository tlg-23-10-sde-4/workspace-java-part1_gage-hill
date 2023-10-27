package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private final String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * The exception stops here.
     * Use finally to guarantee that stop() is called.
     */
    public void goToWork() throws WorkException {
        Car c = new Car("SSG321", "Chevrolet", "Traverse");
        try {
            c.start();
            c.moveTo("West Seattle");
        } catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work", e);
            // System.out.println(e); // toString(0 automatically called (or call e.getMessage())
        }
        finally {
            c.stop();
        }
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}