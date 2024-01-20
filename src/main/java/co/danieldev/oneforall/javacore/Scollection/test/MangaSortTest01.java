package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaComparatorByTitle implements Comparator<Manga> {
    @Override
    public int compare(Manga manga1, Manga manga2) {
        return manga1.getName().compareTo(manga2.getName());
    }
}
public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        Manga m2 = new Manga(2L, "Rakudai kishi no cavalry", 9.99);
        Manga m1 = new Manga(1L, "One piece", 19.99);
        Manga m3 = new Manga(5L, "Pokemon", 7.99);
        Manga m4 = new Manga(3L, "Naruto", 9.99);

        mangas.add(m1);
        mangas.add(m2);
        mangas.add(m3);
        mangas.add(m4);


        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("---------------------");
        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


        System.out.println("---------------------");
//        Collections.sort(mangas, new MangaComparatorByTitle());
        mangas.sort(new MangaComparatorByTitle());

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
