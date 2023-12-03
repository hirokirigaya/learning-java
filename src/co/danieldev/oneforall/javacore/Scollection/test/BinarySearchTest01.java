package co.danieldev.oneforall.javacore.Scollection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(0);
        numbers.add(1);
        numbers.add(4);

        Collections.sort(numbers);
        System.out.println(Collections.binarySearch(numbers, 2));
        System.out.println(Collections.binarySearch(numbers, -2));
        System.out.println(Collections.binarySearch(numbers, -1));
        System.out.println(Collections.binarySearch(numbers, 4));
    }
}
