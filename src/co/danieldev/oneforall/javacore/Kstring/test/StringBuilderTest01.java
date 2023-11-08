package co.danieldev.oneforall.javacore.Kstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String name = "Daniel";
        name.concat(" Junio");

        System.out.println(name);


        StringBuilder name2 = new StringBuilder("Daniel");
        name2.append(" Junio");
        System.out.println(name2);

    }
}
