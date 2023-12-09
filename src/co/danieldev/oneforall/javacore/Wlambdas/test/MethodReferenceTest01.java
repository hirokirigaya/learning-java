package co.danieldev.oneforall.javacore.Wlambdas.test;

import co.danieldev.oneforall.javacore.Wlambdas.domain.Anime;
import co.danieldev.oneforall.javacore.Wlambdas.services.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animes = new ArrayList<>(List.of(new Anime("One piece", 1100), new Anime("Sword Art Online", 100), new Anime("Bleach", 300)));

//        animes.sort((a1,a2) -> a1.getTitle().compareTo(a2.getTitle()));
//        animes.sort((a1,a2) -> AnimeComparators.compareByTitle(a1,a2));
//        animes.sort(AnimeComparators::compareByTitle);
        animes.sort(AnimeComparators::compareByEpisodes);
        System.out.println(animes);

    }
}
