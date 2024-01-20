package co.danieldev.oneforall.javacore.Kstring.test;

public class StringTest02 {
    public static void main(String[] args) {
        String name = "Luffy";
        String name2 = "    Luffy";
        String name3 = "Luffy        ";

        System.out.println(name.substring(0,2)); // similar of slice in the javascript
        System.out.println(name2.trim());
        System.out.println(name3.trim());
    }
}
