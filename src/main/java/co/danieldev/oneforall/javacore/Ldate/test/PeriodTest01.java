package co.danieldev.oneforall.javacore.Ldate.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate ltdNow = LocalDate.now();
        LocalDate ltdNowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(9).plusWeeks(3);


        Period period1 = Period.between(ltdNow, ltdNowAfterTwoYears);
        Period period2 = Period.ofDays(10);
        Period period3 = Period.ofMonths(3);
        Period period4 = Period.ofWeeks(58);


        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);

        System.out.println(ltdNow.until(ltdNow.plusDays(period4.getDays()), ChronoUnit.DAYS));
    }
}
