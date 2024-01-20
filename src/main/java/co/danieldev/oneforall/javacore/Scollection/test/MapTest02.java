package co.danieldev.oneforall.javacore.Scollection.test;

import co.danieldev.oneforall.javacore.Scollection.domain.Customer;
import co.danieldev.oneforall.javacore.Scollection.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Daniel Ferreira");
        Customer customer2 = new Customer("Kirigaya Kazuto");

        Manga manga1 = new Manga(1L, "Rakudai kishi no cavalry", 9.99);
        Manga manga2 = new Manga(2L, "One piece", 19.99);
        Manga manga3 = new Manga(3L, "Pokemon", 7.99);
        Manga manga4 = new Manga(4L, "Naruto", 9.99);
        Manga manga5 = new Manga(5L, "Sword Art Online", 9.99);


        Map<Customer, Manga> customerMangaMap = new HashMap<>();

        customerMangaMap.put(customer1, manga1);
        customerMangaMap.put(customer2, manga5);

        for (Map.Entry<Customer, Manga> entry : customerMangaMap.entrySet()) {
            System.out.println(entry.getKey().getName() + " - " + entry.getValue().getName());
        }
    }
}
