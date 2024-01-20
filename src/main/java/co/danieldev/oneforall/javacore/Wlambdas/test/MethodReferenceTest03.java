package co.danieldev.oneforall.javacore.Wlambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Daniel", "Kirito", "Asuna"));

        names.sort(String::compareTo);
        System.out.println(names);

        Function<String, Integer> stringToInteger = Integer::parseInt;
        Integer apply = stringToInteger.apply("10");
        System.out.println(apply);

        BiPredicate<List<String>, String> listStringsIncludeString = List::contains;
        boolean hasName = listStringsIncludeString.test(names,"Asuna");
        System.out.println(hasName);
    }
}
