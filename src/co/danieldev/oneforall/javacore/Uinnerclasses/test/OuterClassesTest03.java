package co.danieldev.oneforall.javacore.Uinnerclasses.test;

public class OuterClassesTest03 {
    private String name = "Daniel";

    static class Inner {
        public void print() {
            System.out.println(new OuterClassesTest03().name);
        }
    }
    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.print();
    }
}
