package co.danieldev.oneforall.javacore.Fenum.domain;

public class Customer {

    private String name;
    private CustomerType customerType;
    private PaymentType paymentType;

    public Customer(String name, CustomerType customerType, PaymentType paymentType) {
        this.name = name;
        this.customerType = customerType;
        this.paymentType = paymentType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", customerType=" + customerType +
                ", customerTypeDBValue=" + customerType.getDbValue() +
                ", paymentType=" + paymentType +
                '}';
    }
}
