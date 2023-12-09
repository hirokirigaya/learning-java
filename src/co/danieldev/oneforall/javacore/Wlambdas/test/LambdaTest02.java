package co.danieldev.oneforall.javacore.Wlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> strings = List.of("Asuna", "Kirito");

        System.out.println(map(strings, (String s) -> s.length()));
        System.out.println(map(strings,  s -> s.toUpperCase()));

    }
    public static <T, R> List<R> map(List<T> t, Function<T, R> function) {
        List<R> result = new ArrayList<>();

        for (T e: t) {
            R apply = function.apply(e);
            result.add(apply);
        }
        return result;
    }
}
