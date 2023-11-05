package co.danieldev.oneforall.javacore.Kstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String name = "Daniel";
        String name2 = "Daniel";
        name = name.concat(" Junio");
        System.out.println(name);
        System.out.println(name == name2);
        String name3 = new String("Daniel");
        System.out.println(name2 == name3.intern());
    }
}
