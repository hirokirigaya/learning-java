package co.danieldev.oneforall.javacore.Oregex.test;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
    public static void main(String[] args) {
        // All the digits 0-9
        // \D everything that is not \d
        // \s all the blank spaces \t \r \f \n
        // \S everything that is not \s
        // \w all the letters a-zA-Z, 0-9, _
        // \W everything that is not \w
        // []
        // ? zero or one
        // * zero or more
        // + one or more
        // {n,m} from n to m
        // ()
        // | (a|s) persons or persona
        // $
        // . 1.3, 123, 1@3, 1A3


        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";

        String text = "luffy@hotmail.com, 123kirito@mail.com, @123asuna@mail.br, test@gmail.com.br";

        String[] emails = text.split(",");

        System.out.println(emails[0].trim().matches(regex));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        System.out.println("Text:  "+ text);
        System.out.println("Index: "+ "0123456789");
        System.out.println("Regex: "+ regex);
        System.out.println("Positions found");
        while (matcher.find()) {
            System.out.println(matcher.start() + " " + matcher.group());
        }

    }
}
