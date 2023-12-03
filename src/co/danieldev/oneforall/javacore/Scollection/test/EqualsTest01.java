package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("12BA3", "Microsoft");
        Smartphone s2 = new Smartphone("12BA3", "Pixel");

        System.out.println(s1.equals(s2));
    }
}
