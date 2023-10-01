package co.danieldev.oneforall.introduction;


import co.danieldev.oneforall.introduction.methods.domain.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.sumTwoNumbers(6, 3));
        System.out.println(calculator.divideTwoNumbers(5.33, 1.32));
        System.out.println(calculator.divideTwoNumbers(20, 0));
        calculator.changeTwoNumbers(3, 5);


    }
}