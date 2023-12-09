package co.danieldev.oneforall.javacore.Uinnerclasses.test;

import co.danieldev.oneforall.javacore.Tgenerics.domain.Car;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class CarTitleComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class AnonymousClassesTest02 {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>(List.of(new Car("Volvo"), new Car("Audi")));
//        cars.sort(Comparator.comparing(Car::getName));

        cars.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

//        cars.sort(new Comparator<Car>(){
//
//            @Override
//            public int compare(Car o1, Car o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        System.out.println(cars);
    }
}
