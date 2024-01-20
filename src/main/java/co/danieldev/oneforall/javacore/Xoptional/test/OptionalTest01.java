package co.danieldev.oneforall.javacore.Xoptional.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Hello Daniel, how are you?");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        System.out.println(o1);
        System.out.println(o2);
        System.out.println(o3);
        System.out.println("--------");

        Optional<String> name = findName("Daniel");
        System.out.println(name.orElse("EMPTY"));
        name.ifPresent(s -> System.out.println(s.toUpperCase()));
        findName("Ferry").orElseThrow(IllegalArgumentException::new);
    }

    private static Optional<String>  findName(String name) {
        List<String> names = new ArrayList<>(List.of("Daniel", "Ferreira"));
        int index = names.indexOf(name);
        if (index != -1) {
            return Optional.of(names.get(index));
        }
        return Optional.empty();
    }
}
