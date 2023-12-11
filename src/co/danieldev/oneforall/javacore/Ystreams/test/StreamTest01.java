package co.danieldev.oneforall.javacore.Ystreams.test;

import co.danieldev.oneforall.javacore.Ystreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("No Game No Life", 6.99),
            new LightNovel("Sword art Online", 7.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("Tensei Shittara Slime", 3.99),
            new LightNovel("Charlotte", 2.99),
            new LightNovel("Akame ga kill", 4),
            new LightNovel("Chuunibyou Demo Koi Ga Shitai", 1.99)
    ));

    public static void main(String[] args) {
        lightNovels.sort(Comparator.comparing(LightNovel::getTitle));
        System.out.println(lightNovels);

        List<String> titles = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }

            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(titles);
    }
}
