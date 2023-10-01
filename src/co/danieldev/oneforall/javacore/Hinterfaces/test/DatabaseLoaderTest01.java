package co.danieldev.oneforall.javacore.Hinterfaces.test;

import co.danieldev.oneforall.javacore.Hinterfaces.domain.DatabaseLoader;

import java.util.Scanner;

public class DatabaseLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader db = new DatabaseLoader();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write something: ");
        db.loading();

        String test = scanner.nextLine();
        System.out.println(test);


        db.remove();
    }
}
