package co.danieldev.oneforall.introduction.methods.domain;

public class Calculator {

    private int age;

    public int sumTwoNumbers(int number1, int number2) {
        return number1 + number2;
    }

    public double divideTwoNumbers(double number1, double number2) {
        if(number2 == 0) {
            return 0;
        }
        return number1 / number2;
    }

    public void changeTwoNumbers(int number1, int number2) {
        number1 = 99;
        number2 = 33;

        System.out.println("Inside changeTwoNumbers");
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
}
