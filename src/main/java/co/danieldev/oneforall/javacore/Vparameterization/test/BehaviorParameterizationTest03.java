package co.danieldev.oneforall.javacore.Vparameterization.test;

import co.danieldev.oneforall.javacore.Vparameterization.domain.Car;
import co.danieldev.oneforall.javacore.Vparameterization.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterizationTest03 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("red", 2019), new Car("green", 1998), new Car("blue", 1999)));
        List<Integer> numbers = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));

        System.out.println(filter(cars, car -> car.getColor().equals("red")));
        System.out.println(filter(cars, car -> car.getColor().equals("green")));
        System.out.println(filter(cars, car -> car.getYear() < 2015));
        System.out.println(filter(numbers, num -> num % 2 == 0));
    }


    public static <T> List<T> filter(List<T> t, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();

        for (T e: t) {
            if(predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
