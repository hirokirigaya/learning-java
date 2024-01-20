package co.danieldev.oneforall.javacore.Xoptional.repository;

import co.danieldev.oneforall.javacore.Xoptional.domain.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {
    private static List<Manga> mangas = new ArrayList<>(List.of(new Manga(1, "Boku no Hero", 50), new Manga(2, "Sword Art Online", 40)));

    public static Optional<Manga> findByTitle(String title) {
        return findBy(manga -> manga.getTitle().equals(title));
    }

    public static Optional<Manga> findById(Integer id) {
        return findBy(manga -> manga.getId() == id);
    }

    public static Optional<Manga> findBy(Predicate<Manga> predicate) {
        Manga found = null;

        for (Manga manga : mangas) {
            if (predicate.test(manga)) {
                found = manga;
            }

        }
        return Optional.ofNullable(found);
    }
}
