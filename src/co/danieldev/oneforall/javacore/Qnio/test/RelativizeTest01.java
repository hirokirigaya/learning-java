package co.danieldev.oneforall.javacore.Qnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("Java/one-for-all/");
        Path clazz = Paths.get("Java/one-for-all/src/Test01.class");

        Path relativize = dir.relativize(clazz);
        System.out.println(relativize);

        Path absolute1 = Paths.get("www/Java/one-for-all/");
        Path absolute2 = Paths.get("www/Java/one-for-all/one-for-all/src/Test01.class");
        Path absolute3 = Paths.get("Users/sluuc");
        Path relative1 = Paths.get("temp");
        Path relative2 = Paths.get("temp/users");

        System.out.println("1 "+ absolute1.relativize(absolute2));
        System.out.println("2 "+ absolute2.relativize(absolute1));
        System.out.println("3 "+ absolute1.relativize(absolute3));
        System.out.println("4 "+ absolute2.relativize(absolute3));
        System.out.println("5 "+ relative1.relativize(relative2));
        System.out.println("6 "+ relative2.relativize(relative1));
        System.out.println("7 "+ absolute2.relativize(relative1));
    }
}
