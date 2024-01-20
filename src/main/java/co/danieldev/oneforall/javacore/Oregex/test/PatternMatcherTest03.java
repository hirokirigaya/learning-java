package co.danieldev.oneforall.javacore.Oregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // All the digits 0-9
        // \D everything that is not \d
        // \s all the blank spaces \t \r \f \n
        // \S everything that is not \s
        // \w all the letters a-zA-Z, 0-9, _
        // \W everything that is not \w
        // []
        String regex = "0[xX][0-9a-fA-F]";

        String text = "x0 x1 0XFFA12 X0  0xFFg1 0x1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:  "+ text);
        System.out.println("Index: "+ "0123456789");
        System.out.println("Regex: "+ regex);
        System.out.println("Positions found");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

        int hexNumber = 0XFFA12;
        System.out.println(hexNumber);

    }
}
