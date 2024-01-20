package co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain;

import java.util.HashSet;
import java.util.Set;

public final class AircraftSingletonEager {
    private static final  AircraftSingletonEager INSTANCE = new AircraftSingletonEager("737");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1A");
        availableSeats.add("1B");
    }

    private AircraftSingletonEager(String name) {
        this.name = name;
    }

    public boolean bookSeat(String seat) {
        return availableSeats.remove(seat);
    }

    public static AircraftSingletonEager getINSTANCE() {
        return INSTANCE;
    }
}
