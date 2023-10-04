package co.danieldev.oneforall.javacore.Iexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        customFileCreator();
    }

    public static void customFileCreator() {
        File file = new File("folder\\test.txt");
        try {
            boolean fileCreated = file.createNewFile();
            System.out.println("File created: " + fileCreated);
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
