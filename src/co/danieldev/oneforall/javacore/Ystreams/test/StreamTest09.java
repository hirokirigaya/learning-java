package co.danieldev.oneforall.javacore.Ystreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        IntStream.rangeClosed(0,50).filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));
        System.out.println("");
        IntStream.range(0,50).filter(num -> num % 2 == 0).forEach(num -> System.out.print(num + " "));

        System.out.println("");
        System.out.println("----------");
        Stream.of("Hi", "How are you?", "My Name Is Daniel")
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);


        System.out.println("----------");
        int[] nums = {1,2,3,4,5};
        Arrays.stream(nums)
                .average()
                .ifPresent(System.out::println);


        System.out.println("----------");
         try(Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
             lines.filter(line -> line.contains("Java")).forEach(System.out::println);
         } catch(IOException e) {
             e.printStackTrace();
         }
    }
}
