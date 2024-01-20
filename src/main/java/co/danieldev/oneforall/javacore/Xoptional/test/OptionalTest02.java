package co.danieldev.oneforall.javacore.Xoptional.test;

import co.danieldev.oneforall.javacore.Xoptional.domain.Manga;
import co.danieldev.oneforall.javacore.Xoptional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");

        mangaByTitle.ifPresent(manga -> manga.setTitle("Boku no Hero 5"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2)
                .orElseThrow(IllegalAccessError::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Doctor Stone")
                .orElse(new Manga(3, "Doctor Stone", 20));
        System.out.println(newManga);
    }
}
