package co.danieldev.oneforall.javacore.Ystreams.test;

import co.danieldev.oneforall.javacore.Ystreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("No Game No Life", 6.99),
            new LightNovel("Sword art Online", 7.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("Tensei Shittara Slime", 3.99),
            new LightNovel("Charlotte", 2.99),
            new LightNovel("Charlotte", 2.99),
            new LightNovel("Akame ga kill", 4),
            new LightNovel("Chuunibyou Demo Koi Ga Shitai", 1.99)
    ));
    public static void main(String[] args) {
        Stream<LightNovel> stream = lightNovels.stream();

        long count = stream
                .distinct()
                .filter(ln -> ln.getPrice() <= 4)
                .count();


        System.out.println(count);
    }
}
