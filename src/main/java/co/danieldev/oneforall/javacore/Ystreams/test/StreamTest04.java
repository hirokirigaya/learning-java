package co.danieldev.oneforall.javacore.Ystreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> familyList = new ArrayList<>();
        List<String> brothers = List.of("Daniel", "David", "Débora");
        List<String> fathers = List.of("Daniel", "Elisangela");

        familyList.add(brothers);
        familyList.add(fathers);

        for (List<String> family : familyList) {
            for (String person : family) {
                System.out.println(person);
            }
        }

        System.out.println("--------------");

       familyList.stream().flatMap(Collection::stream).forEach(System.out::println);


    }
}
