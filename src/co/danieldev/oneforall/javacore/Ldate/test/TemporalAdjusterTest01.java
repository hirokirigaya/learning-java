package co.danieldev.oneforall.javacore.Ldate.test;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        now = now.withDayOfMonth(15);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


        now = now.with(ChronoField.DAY_OF_MONTH, 15);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = now.with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
