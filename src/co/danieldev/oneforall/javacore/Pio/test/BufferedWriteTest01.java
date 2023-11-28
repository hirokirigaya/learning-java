package co.danieldev.oneforall.javacore.Pio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try(FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("This is a message for your");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
