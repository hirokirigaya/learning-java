package co.danieldev.oneforall.javacore.ZZBdesingpatterns.domain;

public interface Currency {
    public String getSymbol();
}

class Real implements  Currency{

    @Override
    public String getSymbol() {
        return "R$";
    }
}

class USDollar implements  Currency {

    @Override
    public String getSymbol() {
        return "$";
    }
}
