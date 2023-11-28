package co.danieldev.oneforall.javacore.Oregex.test;

import java.util.Scanner;

public class ScannerTest01 {
    public static void main(String[] args) {
        String aot = "Levi,Eren,Mikasa,true,200";
        Scanner scanner = new Scanner(aot);
        scanner.useDelimiter(",");

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println("Int: " + i);
            } else if (scanner.hasNextBoolean()) {
                boolean bol = scanner.nextBoolean();
                System.out.println("Boolean: " + bol);
            } else {
                String text = scanner.next();
                System.out.println("String: "+ text);
            }
        }
    }
}
