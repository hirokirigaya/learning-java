package co.danieldev.oneforall.javacore.Wlambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> strings = List.of("Daniel", "Ferreira");
        List<Integer> integers = List.of(1, 2, 3, 4);

        forEach(strings, s -> System.out.println(s));
        forEach(integers, i -> System.out.println(i));

    }

    public static <T>  void forEach(List<T> t, Consumer<T> consumer) {
        for(T e: t) {
            consumer.accept(e);
        }
    }
}
