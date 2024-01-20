package co.danieldev.oneforall.javacore.Qnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    public static void main(String[] args) {
        Path dir = Paths.get("www/Java");
        Path file = Paths.get("subfolder/file.txt");
        Path resolve = dir.resolve(file);

        System.out.println(resolve);

        Path absolute = Paths.get("/www/Java/");
        Path relative = Paths.get("java-one-for-all");
        Path fileRelative = Paths.get("file.txt");

        System.out.println("1 " + absolute.resolve(relative));
        System.out.println("2 " + absolute.resolve(fileRelative));
        System.out.println("3 " + relative.resolve(absolute));
        System.out.println("4 " + relative.resolve(fileRelative));
        System.out.println("5 " + fileRelative.resolve(absolute));
        System.out.println("6 " + fileRelative.resolve(relative));
    }
}
