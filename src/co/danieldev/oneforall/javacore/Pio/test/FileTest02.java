package co.danieldev.oneforall.javacore.Pio.test;

import java.io.File;

public class FileTest02 {
    public static void main(String[] args) {
        File fileFolder = new File("folder");
        boolean isFolderCreated = fileFolder.mkdir();

        System.out.println("isFolderCreated: "+ isFolderCreated);

        File file = new File("file.txt");


    }
}
