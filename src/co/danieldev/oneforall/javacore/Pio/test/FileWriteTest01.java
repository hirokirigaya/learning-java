package co.danieldev.oneforall.javacore.Pio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
    public static void main(String[] args) {
      File file = new File("file.txt");

      try(FileWriter fw = new FileWriter(file, true)) {
          fw.write("This is a message for your\nHow are you?\n");
          fw.flush();
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }
}
