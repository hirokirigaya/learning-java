package co.danieldev.oneforall.javacore.Ystreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("----------");
        Stream.iterate(new int[]{0,1}, a ->new int[]{a[1], a[0]+a[1]})
                .limit(10)
                .forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println("----------");
        Stream.iterate(new int[]{0,1}, a ->new int[]{a[1], a[0]+a[1]})
                .limit(10)
                .map(arr -> arr[0])
                .forEach(System.out::println);

        System.out.println("----------");
        ThreadLocalRandom current = ThreadLocalRandom.current();
        Stream.generate(() -> current.nextInt(0, 1000))
                .limit(10)
                .forEach(System.out::println);
    }
}
