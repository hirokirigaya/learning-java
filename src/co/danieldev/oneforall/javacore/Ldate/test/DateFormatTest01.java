package co.danieldev.oneforall.javacore.Ldate.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        DateFormat[] dfa = new DateFormat[7];
        Calendar calendar = Calendar.getInstance();

        dfa[0] = DateFormat.getInstance();
        dfa[1] = DateFormat.getDateInstance();
        dfa[2] = DateFormat.getDateTimeInstance();
        dfa[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        dfa[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        dfa[5] = DateFormat.getDateInstance(DateFormat.LONG);
        dfa[6] = DateFormat.getDateInstance(DateFormat.FULL);

        for(DateFormat dateFormat:dfa) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}
