package co.danieldev.oneforall.javacore.Uinnerclasses.test;

public class OuterClassesTest01 {

    private String name = "Monkey D. Luffy";

    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outer = new OuterClassesTest01();
        Inner inner = outer.new Inner();
        inner = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();

    }
}
