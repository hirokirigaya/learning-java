package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Manga;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

class MangaPriceComparator implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
public class NavigableSetTest02 {
    public static void main(String[] args) {
        NavigableSet<Manga> mangas = new TreeSet<>(new MangaPriceComparator());

        Manga m2 = new Manga(2L, "Rakudai kishi no cavalry", 9.99, 0);
        Manga m1 = new Manga(1L, "One piece", 19.99, 0);
        Manga m3 = new Manga(5L, "Pokemon", 7.99, 5);
        Manga m4 = new Manga(3L, "Naruto", 9.99, 2);

        mangas.add(m1);
        mangas.add(m2);
        mangas.add(m3);
        mangas.add(m4);

        Manga yuyuHakusho = new Manga(10L, "Yuyu Hakusho", 1.99, 3);

        // lower <
        // floor <=
        // higher >
        // ceiling >=

        System.out.println(mangas.lower(yuyuHakusho));
        System.out.println(mangas.floor(yuyuHakusho));
        System.out.println(mangas.higher(yuyuHakusho));
        System.out.println(mangas.ceiling(yuyuHakusho));

        System.out.println("---------------------");
        System.out.println(mangas.size());
//        mangas.pollFirst();
        mangas.pollLast();
        System.out.println(mangas.size());
    }
}
