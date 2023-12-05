package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Customer;
import co.danieldev.oneforall.javacore.Scollection.domain.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Daniel Ferreira");
        Customer customer2 = new Customer("Kirigaya Kazuto");

        Manga manga1 = new Manga(1L, "Rakudai kishi no cavalry", 9.99);
        Manga manga2 = new Manga(2L, "One piece", 19.99);
        Manga manga3 = new Manga(3L, "Pokemon", 7.99);
        Manga manga4 = new Manga(4L, "Naruto", 9.99);
        Manga manga5 = new Manga(5L, "Sword Art Online", 9.99);


        Map<Customer, List<Manga>> customerMangaMap = new HashMap<>();

        List<Manga> customer1Mangas = List.of(manga1, manga2, manga3);
        List<Manga> customer2Mangas = List.of(manga4, manga5);

        customerMangaMap.put(customer1, customer1Mangas);
        customerMangaMap.put(customer2, customer2Mangas);

        for (Map.Entry<Customer, List<Manga>> entry: customerMangaMap.entrySet()) {
            System.out.println("---------------------");
            System.out.println(entry.getKey().getName());
            for (Manga manga: entry.getValue()) {
                System.out.println( " - " + manga.getName());
            }
        }
    }
}
