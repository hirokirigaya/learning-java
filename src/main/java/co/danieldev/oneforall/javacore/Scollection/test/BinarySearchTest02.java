package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    public static void main(String[] args) {
        MangaComparatorByTitle mangaComparatorByTitle = new MangaComparatorByTitle();
        List<Manga> mangas = new ArrayList<>();

        Manga m2 = new Manga(2L, "Rakudai kishi no cavalry", 9.99);
        Manga m1 = new Manga(1L, "One piece", 19.99);
        Manga m3 = new Manga(5L, "Pokemon", 7.99);
        Manga m4 = new Manga(3L, "Naruto", 9.99);

        mangas.add(m1);
        mangas.add(m2);
        mangas.add(m3);
        mangas.add(m4);


        Collections.sort(mangas, mangaComparatorByTitle);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("---------------------");
        Manga mangaToBinarySearch = new Manga(2L, "Rakudai kishi no cavalry", 39.99);

        System.out.println(Collections.binarySearch(mangas, mangaToBinarySearch, mangaComparatorByTitle));
    }
}
