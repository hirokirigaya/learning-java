package co.danieldev.oneforall.javacore.Mformatting;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Brazil' dd 'of' MMMM',' yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        System.out.println(simpleDateFormat.format(new Date()));
        try {
            System.out.println(simpleDateFormat.parse("Brazil 13 of November, 2023"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
