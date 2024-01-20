package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaPriceComparator().reversed());

        Manga m2 = new Manga(2L, "Rakudai kishi no cavalry", 9.99);
        Manga m1 = new Manga(1L, "One piece", 19.99);
        Manga m3 = new Manga(5L, "Pokemon", 7.99);
        Manga m4 = new Manga(3L, "Naruto", 9.99);

        mangas.add(m1);
        mangas.add(m2);
        mangas.add(m3);
        mangas.add(m4);

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
