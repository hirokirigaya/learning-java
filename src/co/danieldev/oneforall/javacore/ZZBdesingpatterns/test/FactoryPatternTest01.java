package co.danieldev.oneforall.javacore.ZZBdesingpatterns.test;

import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.Country;
import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.Currency;
import co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain.CurrencyFactory;

public class FactoryPatternTest01 {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.Currency(Country.BRAZIL);
        System.out.println(currency.getSymbol());
    }
}
