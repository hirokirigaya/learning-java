package co.danieldev.oneforall.javacore.Ldate.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIds = ZoneId.SHORT_IDS;
        System.out.println(shortIds);
        System.out.println(ZoneId.systemDefault());

        ZoneId tokyoZone = ZoneId.of("Asia/Tokyo");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = now.atZone(tokyoZone);
        System.out.println(zonedDateTime);

        Instant instant = Instant.now();
        System.out.println(instant);
        ZonedDateTime zonedDateTime2 = instant.atZone(tokyoZone);
        System.out.println(zonedDateTime2);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset manausOffset = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime1 = now.atOffset(manausOffset);
        System.out.println(offsetDateTime1);

        OffsetDateTime offsetDateTime2 = instant.atOffset(manausOffset);
        System.out.println(offsetDateTime2);

        JapaneseDate japaneseDate1 = JapaneseDate.now();
        JapaneseDate japaneseDate2 = JapaneseDate.of(1900, Month.JANUARY.getValue(), 1);

        System.out.println(japaneseDate1);
        System.out.println(japaneseDate2);

    }
}
