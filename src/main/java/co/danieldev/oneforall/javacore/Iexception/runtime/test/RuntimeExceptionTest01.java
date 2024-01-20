package co.danieldev.oneforall.javacore.Iexception.runtime.test;

public class RuntimeExceptionTest01 {
        public static void main(String[] args) {

            division(1,0);
        }
        private static int division(int a, int b) {
            if (b == 0) {
                throw new IllegalArgumentException("The second parameter can't be zero");
            }
            return a / b;
        }

}
