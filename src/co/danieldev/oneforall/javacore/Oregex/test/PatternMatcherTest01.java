package co.danieldev.oneforall.javacore.Oregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest01 {
    public static void main(String[] args) {
        String regex = "aba";

//        String text = "abaabba";
        String text2 = "abababa";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text2);

        System.out.println("Text:  "+ text2);
        System.out.println("Index: "+ "0123456789");
        System.out.println("Regex: "+ regex);
        System.out.println("Positions found");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
        }

    }
}
