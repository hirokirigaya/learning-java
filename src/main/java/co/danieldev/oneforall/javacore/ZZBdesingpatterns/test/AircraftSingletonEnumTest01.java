package co.danieldev.oneforall.javacore.ZZBdesingpatterns.test;

import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.AircraftSingletonEnum;
import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.AircraftSingletonLazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class AircraftSingletonEnumTest01 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        bookSeat("1A");
        bookSeat("1A");
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());
        System.out.println(AircraftSingletonEnum.INSTANCE.hashCode());

    }

    static void bookSeat(String seat) {
        AircraftSingletonEnum aircraft = AircraftSingletonEnum.INSTANCE;
        System.out.println(aircraft.hashCode());
        System.out.println(aircraft.bookSeat(seat));
    }
}
