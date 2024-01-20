package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneTestList01 {
    public static void main(String[] args) {
        List<Smartphone> smartphones = new ArrayList<>();

        Smartphone s1 = new Smartphone("32SD33", "Nokia");
        Smartphone s2 = new Smartphone("3232FA", "Iphone");
        Smartphone s3 = new Smartphone("4342AS", "Samsung");

        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);

        System.out.println(smartphones);
    }
}
