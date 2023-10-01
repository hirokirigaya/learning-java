package co.danieldev.oneforall.javacore.Fenum.test;

import co.danieldev.oneforall.javacore.Fenum.domain.Customer;
import co.danieldev.oneforall.javacore.Fenum.domain.CustomerType;
import co.danieldev.oneforall.javacore.Fenum.domain.PaymentType;

public class CustomerTest01 {
    public static void main(String[] args) {
        Customer customer01 =  new Customer("Faber Castle", CustomerType.INDIVIDUAL, PaymentType.CREDIT);
        Customer customer02 =  new Customer("Faber Castle", CustomerType.COMPANY, PaymentType.DEBIT);


        System.out.println(customer01);
        System.out.println(customer02);
        // System.out.println(PaymentType.CREDIT.calculateDiscount(100));

        CustomerType customerType = CustomerType.getByReportValue("individual");
        System.out.println(customerType);
    }
}
