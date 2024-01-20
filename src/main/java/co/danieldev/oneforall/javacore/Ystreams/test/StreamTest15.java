package co.danieldev.oneforall.javacore.Ystreams.test;

import co.danieldev.oneforall.javacore.Ystreams.domain.Category;
import co.danieldev.oneforall.javacore.Ystreams.domain.LightNovel;
import co.danieldev.oneforall.javacore.Ystreams.domain.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static co.danieldev.oneforall.javacore.Ystreams.domain.Promotion.NORMAL_PRICE;
import static co.danieldev.oneforall.javacore.Ystreams.domain.Promotion.PROMOTION_PRICE;

public class StreamTest15 {
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
        Map<Category, DoubleSummaryStatistics> collect = lightNovels.stream()
                .collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.summarizingDouble(LightNovel::getPrice)));

        Map<Category, Set<Promotion>> collect1 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(
                StreamTest15::getPromotion, Collectors.toCollection(HashSet::new)
        )));

        Map<Category, Set<Promotion>> collect2 = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory, Collectors.mapping(
                StreamTest15::getPromotion, Collectors.toCollection(LinkedHashSet::new)
        )));


        System.out.println(collect);
        System.out.println(collect1);
        System.out.println(collect2);
    }

    private static Promotion getPromotion(LightNovel ln) {
        return ln.getPrice() < 6 ? PROMOTION_PRICE : NORMAL_PRICE;
    }
}
