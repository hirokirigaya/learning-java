package co.danieldev.oneforall.javacore.Scollection.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<>(); // order by insertion
//        Map<String, String> map = new HashMap();

        map.put("keuboard", "keyboard");
        map.put("moyse", "mouse");
        map.put("yoi", "you");
        map.put("yoi2", "you2");


        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        System.out.println("--------------");

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("--------------");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": "+ entry.getValue());
        }
    }
}
