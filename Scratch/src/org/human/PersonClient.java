package org.human;

import java.time.LocalDate;
import java.time.Period;

class PersonClient {
    public static void main(String[] args) {
        Person p1 = new Person("Gage", LocalDate.of(1996, 1, 10));
        System.out.println(p1);

        System.out.printf("%s is %s years old\n", p1.getName(), p1.getAge());
    }
}