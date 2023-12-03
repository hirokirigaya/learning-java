package co.danieldev.oneforall.javacore.Scollection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();

        mangas.add("Pokemon");
        mangas.add("Dragon ball");
        mangas.add("Naruto");
        mangas.add("One Piece");

        System.out.println(mangas);
        Collections.sort(mangas);
        System.out.println(mangas);


        List<Double> doubles = new ArrayList<>();

        doubles.add(101.40);
        doubles.add(101.10);
        doubles.add(1D);
        doubles.add(101.20);
        doubles.add(101.19);

        System.out.println(doubles);
        Collections.sort(doubles);
        System.out.println(doubles);
    }
}
