package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();

        Manga m2 = new Manga(2L, "Rakudai kishi no cavalry", 9.99);
        Manga m1 = new Manga(1L, "One piece", 19.99);
        Manga m3 = new Manga(5L, "Pokemon", 7.99);
        Manga m4 = new Manga(3L, "Naruto", 9.99);

        mangas.add(m1);
        mangas.add(m2);
        mangas.add(m3);
        mangas.add(m4);
    }
}
