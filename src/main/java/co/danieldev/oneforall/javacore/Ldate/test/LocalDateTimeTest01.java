package co.danieldev.oneforall.javacore.Ldate.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2023-11-14");
        LocalTime time = LocalTime.parse("09:21:45");

        System.out.println(now);
        System.out.println(date);
        System.out.println(time);

        LocalDateTime dateTime1 = LocalDateTime.of(date, time);
        LocalDateTime dateTime2 = date.atTime(time);
        LocalDateTime dateTime3 = time.atDate(date);

        System.out.println(dateTime1);
        System.out.println(dateTime2);
        System.out.println(dateTime3);

    }
}
