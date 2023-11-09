package co.danieldev.oneforall.javacore.Ldate.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("First day of the week is Sunday");
        }

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(date);
    }
}
