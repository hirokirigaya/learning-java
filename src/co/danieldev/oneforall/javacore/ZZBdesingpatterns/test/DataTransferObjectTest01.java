package co.danieldev.oneforall.javacore.ZZBdesingpatterns.test;

import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.*;
import co.danieldev.oneforall.javacore.ZZBdesingpatterns.dto.ReportDto;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("737");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.Currency(country);

        Person person = Person.PersonBuilder
                .builder()
                .firstName("Daniel")
                .lastName("Ferreira")
                .build();

        ReportDto reportDto = ReportDto.ReportDtoBuilder
                .builder()
                .aircraftName(aircraft.getName())
                .currency(currency)
                .country(country)
                .personName(person.getFirstName())
                .build();

        System.out.println(reportDto);
    }
}
