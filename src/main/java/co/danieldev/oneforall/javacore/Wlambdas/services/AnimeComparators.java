package co.danieldev.oneforall.javacore.Wlambdas.services;

import co.danieldev.oneforall.javacore.Wlambdas.domain.Anime;

public class AnimeComparators {

    public static int compareByTitle(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int compareByEpisodes(Anime a1, Anime a2) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    public int compareByTitleNonStatic(Anime a1, Anime a2) {
        return a1.getTitle().compareTo(a2.getTitle());
    }
}
