/*
 * The Java 8 Date/Time API consists of package java.time and its subpackages.
 * We will cover packages and imports in Session 7.
 * For the purposes of this lab, we give you a few wildcarded imports,
 * so you can use the classes in these packages without having to worry about importing them.
 */
import java.time.*;
import java.time.format.*;

class DateTimeTest {
    public static void main(String[] args) {
        testNow();
        testCreate();
        testParse();
        testFormat();
    }

    public static void testNow() {
        LocalDate currentDate = LocalDate.now(); // getting current date
        LocalTime currentTime = LocalTime.now(); // getting current time
        LocalDateTime currentDateTIme = LocalDateTime.now(); // getting current date and time

        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);
        System.out.println("Current Date and Time: " + currentDateTIme);
    }

    public static void testCreate() {
        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalTime now = LocalTime.now().withSecond(0).withNano(0);
        System.out.println(now);

        LocalDateTime timestamp = LocalDateTime.now().withSecond(0).withNano(0);
        System.out.println(timestamp);

        LocalDate bday = LocalDate.of(1996, 1, 10);
        System.out.println(bday.getDayOfWeek());

        LocalDateTime moonLanding = LocalDateTime.of(1969, 7, 20, 15, 18); // NOTE: ignore time-zone, just assume Eastern Time is the local time.
        System.out.println(moonLanding);
    }

    public static void testParse() {
        // parsing a LocalDate from a string in the format 'yyyy-MM-dd'
        LocalDate bday = LocalDate.parse("1996-01-10");
        System.out.println("Birthday: " + bday);

        // format as 'M/d/yyyy'
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date = LocalDate.parse("2/6/2014", formatter);
        System.out.println("Parsed Date: " + date);
    }

    public static void testFormat() {
        LocalDate hastings = LocalDate.of(1066, 10, 14);

        // format as MM/dd/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedDate1 = hastings.format(formatter1);
        System.out.println("Formatted Date (MM/dd/yyyy): " + formattedDate1);

        // format as dd-MM-yyyy
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate2 = hastings.format(formatter2);
        System.out.println("Formatted Date (dd-MM-yyyy): " + formattedDate2);

        // format as MMMM dd, yyyy
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String formattedDate3 = hastings.format(formatter3);
        System.out.println("Formatted Date (MMMM dd, yyyy): " + formattedDate3);
    }
}