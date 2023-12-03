package co.danieldev.oneforall.javacore.Scollection.domain;

import java.util.Objects;

public class Manga implements Comparable<Manga> {
    private Long id;
    private String name;
    private double price;

    public Manga(Long id, String name, double price) {
        Objects.requireNonNull(id, "ID must not be null");
        Objects.requireNonNull(name, "Name must not be null");
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manga manga = (Manga) o;
        return id.equals(manga.id) && name.equals(manga.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Manga otherManga) {
//        if (this.id < otherManga.id) {
//            return -1;
//        } else if (this.id.equals(otherManga.id)) {
//            return 0;
//        }
//        return 1;
//        return Double.compare(this.price, otherManga.price);
//        return this.name.compareTo(otherManga.name);
        return this.id.compareTo(otherManga.id);
    }
}
