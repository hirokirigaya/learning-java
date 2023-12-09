package co.danieldev.oneforall.javacore.Wlambdas.test;

import co.danieldev.oneforall.javacore.Wlambdas.domain.Anime;
import co.danieldev.oneforall.javacore.Wlambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest02 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("One piece", 1100), new Anime("Sword Art Online", 100), new Anime("Bleach", 300)));
        AnimeComparators animeComparators = new AnimeComparators();

        animes.sort(animeComparators::compareByTitleNonStatic);
        System.out.println(animes);

    }
}
