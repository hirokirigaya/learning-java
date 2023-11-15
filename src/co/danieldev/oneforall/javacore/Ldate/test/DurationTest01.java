package co.danieldev.oneforall.javacore.Ldate.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime ldtNow = LocalDateTime.now();
        LocalDateTime ldtNowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(9);

        LocalTime ltNow = LocalTime.now();
        LocalTime ltNowMinusSevenHours = LocalTime.now().minusHours(7);


        Duration df1 = Duration.between(ldtNow, ldtNowAfterTwoYears);
        Duration df2 = Duration.between(ltNow, ltNowMinusSevenHours);

        System.out.println(df1);
        System.out.println(df2);
    }
}
