package co.danieldev.oneforall.javacore.ZZBdesingpatterns.test;

import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.AircraftSingletonLazy;

public class AircraftSingletonLazyTest01 {
    public static void main(String[] args) {
        bookSeat("1A");
        bookSeat("1A");
        bookSeat("1A");
    }

    static void bookSeat(String seat) {
        AircraftSingletonLazy aircraft = AircraftSingletonLazy.getINSTANCE();
        System.out.println(aircraft);
        System.out.println(aircraft.bookSeat(seat));
    }
}
