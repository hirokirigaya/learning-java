package co.danieldev.oneforall.javacore.Scollection.test;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();

        navigableMap.put("A", "Letter A");
        navigableMap.put("D", "Letter D");
        navigableMap.put("B", "Letter B");
        navigableMap.put("E", "Letter E");
        navigableMap.put("C", "Letter C");

        for (Map.Entry<String, String> entry : navigableMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("-----------------------");
        System.out.println(navigableMap.headMap("C"));
        System.out.println("-----------------------");

        // lower <
        // floor <=
        // higher >
        // ceiling >=
        System.out.println(navigableMap.lowerKey("C"));
//        System.out.println(navigableMap.lowerEntry("C")); // return key and entry
        System.out.println(navigableMap.floorKey("C"));
        System.out.println(navigableMap.higherKey("C"));
        System.out.println(navigableMap.ceilingKey("C"));
    }
}
