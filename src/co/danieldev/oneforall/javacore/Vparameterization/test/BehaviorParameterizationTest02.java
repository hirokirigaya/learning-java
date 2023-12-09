package co.danieldev.oneforall.javacore.Vparameterization.test;

import co.danieldev.oneforall.javacore.Vparameterization.domain.Car;
import co.danieldev.oneforall.javacore.Vparameterization.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;

public class BehaviorParameterizationTest02 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("red", 2019), new Car("green", 1998), new Car("blue", 1999)));

        System.out.println(filter(cars, car -> car.getColor().equals("red")));
        System.out.println(filter(cars, car -> car.getColor().equals("green")));
        System.out.println(filter(cars, car -> car.getYear() < 2015));
    }


    private static List<Car> filter(List<Car> cars, CarPredicate predicate) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (predicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
