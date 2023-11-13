package co.danieldev.oneforall.javacore.Mformatting;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        Locale localeBrazil = new Locale("pt", "BR");
        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");


        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeBrazil);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);

        System.out.println(df1.format(calendar.getTime()));
        System.out.println(df2.format(calendar.getTime()));
        System.out.println(df3.format(calendar.getTime()));
    }
}
