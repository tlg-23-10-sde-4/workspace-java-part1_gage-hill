package org.human;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/*
 * An immutable class. more accurately, a class definition written in such a way that instances of it, once created,
 * cannot have their properties changed.
 * There are no public methods to do so.
 */
// fields
class Person {
    private String name;
    private LocalDate birthDate;

// constructor
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    /*
     * Returns the person's age in whole years.
     * This is a derived property, "i.e., it is calculated and returned, not stored in a field.
     */
    public int getAge() {
        return Period.between(getBirthDate(), LocalDate.now()).getYears();
    }

// accessor methods
    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

// toString()
    public String toString() {
        return String.format("Person: name=%s, birthDate=%s", getName(), getBirthDate());
    }
}