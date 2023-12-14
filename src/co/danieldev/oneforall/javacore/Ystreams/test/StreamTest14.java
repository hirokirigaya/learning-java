package co.danieldev.oneforall.javacore.Ystreams.test;

import co.danieldev.oneforall.javacore.Ystreams.domain.Category;
import co.danieldev.oneforall.javacore.Ystreams.domain.LightNovel;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("No Game No Life", 6.99, Category.FANTASY),
            new LightNovel("Sword art Online", 7.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("Tensei Shittara Slime", 3.99, Category.FANTASY),
            new LightNovel("Charlotte", 2.99, Category.FANTASY),
            new LightNovel("Akame ga kill", 4, Category.FANTASY),
            new LightNovel("Chuunibyou Demo Koi Ga Shitai", 1.99, Category.ROMANCE)
    ));

    public static void main(String[] args) {
        Map<Category, Long> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.counting()));

        Map<Category, Optional<LightNovel>> collect2 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))));

        Map<Category, LightNovel> collect3 = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                                Optional::get
                        )));

        System.out.println(collect1);
        System.out.println(collect2);
        System.out.println(collect3);
    }
}
