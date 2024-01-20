package co.danieldev.oneforall.javacore.Iexception.exception.test;

import co.danieldev.oneforall.javacore.Iexception.exception.domain.Reader1;
import co.danieldev.oneforall.javacore.Iexception.exception.domain.Reader2;

import java.io.*;

public class TryWithResourceTest01 {
    public static void main(String[] args) {
        ReadFile();
    }

    private static void ReadFile() {
        try(Reader1 reader1 = new Reader1(); Reader2 reader2 = new Reader2()) {

        } catch(IOException e){
            e.printStackTrace();
        }
    }

    private static void ReadFile2() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
