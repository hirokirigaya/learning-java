package co.danieldev.oneforall.javacore.Qnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String directory = "www/Java/java-one-for-all";
        String directory2 = "../../file.txt";

        Path path = Paths.get(directory, directory2);
        System.out.println(path);
        System.out.println(path.normalize());

    }
}
