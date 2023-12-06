package co.danieldev.oneforall.javacore.Tgenerics.test;

import co.danieldev.oneforall.javacore.Tgenerics.domain.Boat;

import java.util.List;

public class GenericMethodTest01 {
    public static void main(String[] args) {
        List<Boat> boatList = createArrayWithOneObject(new Boat("Boat 1"));
        boatList.add(new Boat("Boat 2"));
    }

    private static <T> List<T> createArrayWithOneObject(T t) {
        return List.of(t);
    }
}
