package co.danieldev.oneforall.javacore.Iexception.error.test;

public class StackOverflowTest01 {
    public static void main(String[] args) {
        stackOverflow();
    }

    public static void stackOverflow() {
        stackOverflow();
    }
}
