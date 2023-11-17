/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.rmi.registry.LocateRegistry;
import java.time.*;
import java.time.format.*;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.DayOfWeek.*; // MONDAY instead of DayOfWeek.MONDAY
import static java.time.temporal.TemporalAdjusters.*;

class DerivedDateTimeTest {
    public static void main(String[] args) {
        testPresidentsFirst100Days();
        testPopularBirthdays();
        testEarlyRetirement();
        testLaborDay();
        testElectionDay();
        testAnniversary();
    }

    public static void testPresidentsFirst100Days() {
        LocalDate inauguration = LocalDate.of(2017, 1, 20);
        LocalDate deadline = inauguration.plusDays(100);
        System.out.println(deadline);
    }

    public static void testPopularBirthdays() {
        // average birthday of someone conceived on Valentine's Day
        LocalDate vday = LocalDate.of(2023, 2, 14);
        LocalDate bday = vday.plusWeeks(38);
        System.out.println("Average birthday: [Valentine's Day] " + bday);

        // average birthday of someone conceiving on New Year's Day
        LocalDate nye = LocalDate.of(2023, 2, 14);
        LocalDate nyeBday = nye.plusWeeks(38);
        System.out.println("Average birthday: [New Year's Day] " + bday);
    }

    public static void testEarlyRetirement() {
        LocalDate bday = LocalDate.of(1996, 1, 10);
        LocalDate retirement = bday.plusYears(59).plusMonths(6);
        System.out.println("Retirement day of the week: " + retirement.getDayOfWeek());
    }

    public static void testLaborDay() {
        LocalDate sept1 = LocalDate.of(1996, 9,1);
        LocalDate laborDay = sept1.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
        System.out.println("Labor Day: " + laborDay);
        System.out.println("Day of the week: " + laborDay.getDayOfWeek());
    }

    public static void testElectionDay() {
        LocalDate nov1 = LocalDate.of(2024, 11, 1);
        LocalDate electionDay = nov1.with(nextOrSame(MONDAY));
        System.out.println("Election Day: " + electionDay);
    }

    public static void testAnniversary() {
        LocalDate wedding = LocalDate.of(1969, 6, 6);
        LocalDate anniversary = wedding.plusYears(50);
        LocalDate party = anniversary.with(nextOrSame(SATURDAY));
        System.out.println("Anniversary day of the week: " + party.getDayOfWeek());
    }
}