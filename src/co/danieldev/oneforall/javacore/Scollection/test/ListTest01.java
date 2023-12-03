package co.danieldev.oneforall.javacore.Scollection.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Daniel Ferri");
        names.add("Daniel Ferreira");

        for (String name : names) {
            System.out.println(name);
        }


        System.out.println("---------------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

    }
}
