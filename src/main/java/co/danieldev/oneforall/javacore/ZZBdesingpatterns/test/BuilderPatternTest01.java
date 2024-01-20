package co.danieldev.oneforall.javacore.ZZBdesingpatterns.test;

import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.Person;

public class BuilderPatternTest01 {
    public static void main(String[] args) {
        Person person = Person.PersonBuilder
                .builder()
                .firstName("Daniel")
                .lastName("Ferreira")
                .username("daniel.fery")
                .email("danielferreiradeveloper@gmail.com")
                .build();

        System.out.println(person);
    }
}
