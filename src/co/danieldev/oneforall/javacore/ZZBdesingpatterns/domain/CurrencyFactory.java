package co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain;

public class CurrencyFactory {
    public static Currency Currency(Country country) {
        switch (country) {
            case USA:
                return new USDollar();
            case BRAZIL:
                return new Real();
            default:
                throw new IllegalArgumentException("No currency to given the country");

        }
    }
}
