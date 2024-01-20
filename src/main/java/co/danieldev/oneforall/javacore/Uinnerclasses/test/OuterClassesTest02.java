package co.danieldev.oneforall.javacore.Uinnerclasses.test;

public class OuterClassesTest02 {

    private String name = "Midoriya";

    void print() {
        String lastname = "Izuku";
        class LocalClass {
            public void printName() {
                System.out.println(name + " " + lastname);
            }
        }

        new LocalClass().printName();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print();
    }
}
