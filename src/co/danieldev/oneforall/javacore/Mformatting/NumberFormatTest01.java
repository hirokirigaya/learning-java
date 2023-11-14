package co.danieldev.oneforall.javacore.Mformatting;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;

        NumberFormat[] nba = new NumberFormat[4];

        nba[0] = NumberFormat.getInstance();
        nba[1] = NumberFormat.getInstance(localeBR);
        nba[2] = NumberFormat.getInstance(localeJP);
        nba[3] = NumberFormat.getInstance(localeIT);

        double value = 100_000_000.2132;

        for (NumberFormat numberFormat : nba) {
            System.out.println(numberFormat.format(value));
        }

        String stringValue = "1234.233";

        try {
            System.out.println(nba[1].parse(stringValue));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
