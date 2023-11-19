package co.danieldev.oneforall.javacore.Mformatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();

        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s1 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        String s3 = date.format(DateTimeFormatter.BASIC_ISO_DATE);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        LocalDate parse1 = LocalDate.parse("20231118", DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(parse1);


        LocalDateTime now = LocalDateTime.now();
        String s4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        LocalDateTime parse2 = LocalDateTime.parse("2023-11-18T20:56:18.8721916");

        System.out.println(s4);
        System.out.println(parse2);


        // dd/MM/yyyy  MM/dd/yyyy  yyyy/MM/dd
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);

        LocalDate parseBR = LocalDate.parse("18/11/2023", formatterBR);
        System.out.println(parseBR);


        DateTimeFormatter formatterIT = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.ITALY);
        String formatIT = LocalDate.now().format(formatterIT);
        System.out.println(formatIT);

    }
}
