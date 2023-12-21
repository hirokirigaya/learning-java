package co.danieldev.oneforall.javacore.Ystreams.test;

import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamTest16 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        System.out.println(Runtime.getRuntime().availableProcessors());
        long num = 10_000_000;
        sum(num);
        sumStreamIterate(num);
        sumParallelStreamIterate(num);
        sumLongStreamRangeClosed(num);
    }

    static void sum(long num) {
        long init = System.currentTimeMillis();
        int result = 0;
        for (int i = 0; i < num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");
    }

    static void sumStreamIterate(long num) {
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1l, l -> l + 1).limit(num).reduce(0l, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");
    }

    static void sumParallelStreamIterate(long num) {
        long init = System.currentTimeMillis();
        Long result = Stream.iterate(1l, l -> l + 1).parallel().limit(num).reduce(0l, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");
    }

    static void sumLongStreamRangeClosed(long num) {
        long init = System.currentTimeMillis();
        Long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();

        System.out.println(result + " " + (end - init) + "ms");
    }
}
