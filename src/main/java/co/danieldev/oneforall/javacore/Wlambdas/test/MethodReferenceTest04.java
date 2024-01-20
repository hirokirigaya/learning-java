package co.danieldev.oneforall.javacore.Wlambdas.test;

import co.danieldev.oneforall.javacore.Wlambdas.domain.Anime;
import co.danieldev.oneforall.javacore.Wlambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> animeComparatorsSupplier = AnimeComparators::new;
//        AnimeComparators animeComparators = new AnimeComparators();
        AnimeComparators animeComparators = animeComparatorsSupplier.get();
        List<Anime> animes = new ArrayList<>(List.of(new Anime("One piece", 1100), new Anime("Sword Art Online", 100), new Anime("Bleach", 300)));

        animes.sort(animeComparators::compareByTitleNonStatic);
        System.out.println(animes);


        BiFunction<String, Integer, Anime> animeBiFunction = Anime::new;
        System.out.println(animeBiFunction.apply("Rakudai kishi no cavalry", 100));
    }
}
