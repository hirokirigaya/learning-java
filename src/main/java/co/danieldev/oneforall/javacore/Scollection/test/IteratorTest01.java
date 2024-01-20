package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();

        Manga m2 = new Manga(2L, "Rakudai kishi no cavalry", 9.99, 0);
        Manga m1 = new Manga(1L, "One piece", 19.99, 0);
        Manga m3 = new Manga(5L, "Pokemon", 7.99, 5);
        Manga m4 = new Manga(3L, "Naruto", 9.99, 8);

        mangas.add(m1);
        mangas.add(m2);
        mangas.add(m3);
        mangas.add(m4);

//        Iterator<Manga> mangaIterator = mangas.iterator();

//        while (mangaIterator.hasNext()) {
//            Manga manga = mangaIterator.next();
//            if (manga.getQuantity() == 0) {
//                mangaIterator.remove();
//            }
//        }

        mangas.removeIf(manga -> manga.getQuantity() == 0);
        System.out.println(mangas);

    }
}
