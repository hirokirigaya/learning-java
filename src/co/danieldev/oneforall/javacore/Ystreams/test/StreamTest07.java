package co.danieldev.oneforall.javacore.Ystreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4);
        Integer reduce = integers.stream().reduce(0, (num, acc) -> num + acc);
        Integer reduce2 = integers.stream().reduce(0, Integer::sum);
        System.out.println(reduce);
        System.out.println(reduce2);

        System.out.println("-----------");

        integers.stream().reduce((num, acc) -> num * acc).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (num, acc) -> num * acc));

        System.out.println("-----------");

        integers.stream().reduce((num, acc) -> num * acc).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(1, (num, acc) -> num * acc));

        System.out.println("-----------");

        integers.stream().reduce((num, acc) -> num > acc ? num : acc).ifPresent(System.out::println);
        System.out.println(integers.stream().reduce(0, Integer::max));

    }
}
