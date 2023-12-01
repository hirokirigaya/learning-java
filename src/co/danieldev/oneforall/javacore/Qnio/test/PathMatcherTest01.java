package co.danieldev.oneforall.javacore.Qnio.test;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherTest01 {
    public static void main(String[] args) {
        Path path1 = Paths.get("folder/file.gkp");
        Path path2 = Paths.get("folder/file.txt");
        Path path3 = Paths.get("folder/file.java");

        matches(path1, "glob:*.gkp");
        matches(path1, "glob:**.gkp");
        matches(path1, "glob:**/*.gkp");
        matches(path1, "glob:**/*.{gkp,java,txt}");
        matches(path2, "glob:**/*.{gkp,java,txt}");
        matches(path3, "glob:**/*.{gkp,java,txt}");
        matches(path1, "glob:**/*.???");
        matches(path2, "glob:**/*.???");
        matches(path3, "glob:**/*.???");
        matches(path3, "glob:**/file.????");
    }

    private static void matches(Path path, String glob) {
        PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+ pathMatcher.matches(path));
    }
}
