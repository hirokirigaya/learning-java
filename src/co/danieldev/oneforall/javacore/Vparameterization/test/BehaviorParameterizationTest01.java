package co.danieldev.oneforall.javacore.Vparameterization.test;

import co.danieldev.oneforall.javacore.Vparameterization.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class BehaviorParameterizationTest01 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("red", 2019), new Car("green", 1998), new Car("blue", 1999)));

        System.out.println(filterCarsRedColor(cars));
        System.out.println(filterCarsGreenColor(cars));
        System.out.println(filterCarsByColor(cars, "red"));
        System.out.println(filterCarsByColor(cars, "green"));

    }

    private static List<Car> filterCarsRedColor(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals("red")) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarsGreenColor(List<Car> cars) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals("green")) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterCarsByColor(List<Car> cars, String color) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (car.getColor().equals(color)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
