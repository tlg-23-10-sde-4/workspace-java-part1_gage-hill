import java.util.*;
import java.time.*;

class ConcertTimeTest {
    public static void main(String[] args) {
        listAvailableZoneIds();
        testLiveConcert();
    }

    /*
     * Shows all defined ZoneIds, which will help with the concert problem.
     * You'll need to know the names of the ZoneIds for Toronto and Perth.
     */
    public static void listAvailableZoneIds() {
        Set<String> rawZoneIds = ZoneId.getAvailableZoneIds();  // unsorted, arbitrary order
        SortedSet<String> zoneIds = new TreeSet<>(rawZoneIds);  // sorted by String natural order

        for (String zoneId : zoneIds) {
            System.out.println(zoneId);
        }
    }

    public static void testLiveConcert() {
        // ZoneIds for Toronto and Perth
        ZoneId torontoZone = ZoneId.of("America/Toronto");
        ZoneId perthZone = ZoneId.of("Australia/Perth");

        // LocalDateTime of the concert in Toronto
        LocalDateTime concertTimeToronto = LocalDateTime.of(2020, Month.APRIL, 18, 19, 0);

        // convert Toronto time to UTC
        ZonedDateTime concertTimeUTC = concertTimeToronto.atZone(torontoZone).withZoneSameInstant(ZoneOffset.UTC);

        // convert UTC time to Perth time
        ZonedDateTime concertTimePerth = concertTimeUTC.withZoneSameInstant(perthZone);
        System.out.println("Concert time in Perth: " + concertTimePerth);
    }
}