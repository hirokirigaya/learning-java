package co.danieldev.oneforall.javacore.Ystreams.test;

import co.danieldev.oneforall.javacore.Ystreams.domain.Category;
import co.danieldev.oneforall.javacore.Ystreams.domain.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest12 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("No Game No Life", 6.99, Category.FANTASY),
            new LightNovel("Sword art Online", 7.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("Tensei Shittara Slime", 3.99, Category.FANTASY),
            new LightNovel("Charlotte", 2.99, Category.FANTASY),
            new LightNovel("Akame ga kill", 4, Category.FANTASY),
            new LightNovel("Chuunibyou Demo Koi Ga Shitai", 1.99, Category.FANTASY)
    ));
    public static void main(String[] args) {
        Map<Category, List<LightNovel>> categoryListMap = new HashMap<>();
        List<LightNovel> romance = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> fantasy = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
            switch (lightNovel.getCategory()) {
                case DRAMA: drama.add(lightNovel); break;
                case FANTASY: fantasy.add(lightNovel); break;
                case ROMANCE: romance.add(lightNovel); break;
            }
        }
        categoryListMap.put(Category.DRAMA, drama);
        categoryListMap.put(Category.FANTASY, fantasy);
        categoryListMap.put(Category.ROMANCE, romance);
        System.out.println(categoryListMap);

        System.out.println("-----------");

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
    }
}
