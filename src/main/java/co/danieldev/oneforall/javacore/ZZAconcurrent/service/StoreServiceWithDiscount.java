package co.danieldev.oneforall.javacore.ZZAconcurrent.service;

import co.danieldev.oneforall.javacore.ZZAconcurrent.domain.Discount;
import co.danieldev.oneforall.javacore.ZZAconcurrent.domain.Quote;

import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class StoreServiceWithDiscount {

    // storeName:price:discount.code
    public String getPricesSync(String storeName) {
        double price = priceGenerator();

        Discount.Code discountCode = Discount.Code.values()[
                ThreadLocalRandom.current()
                        .nextInt(Discount.Code.values().length)
                ];
        return String.format("%s:%.2f:%s", storeName, price, discountCode);
    }

    public String applyDiscount(Quote quote) {
        delay();
        double discountPrice = quote.getPrice() * (100 - quote.getDiscountCode().getPercentage()) / 100;
        System.out.println(discountPrice);
        return String.format("'%s' original price: %.2f. Applying discount code: '%s'. Final price: '%.2f' ",
                quote.getStore(),
                quote.getPrice(),
                quote.getDiscountCode(),
                discountPrice);
    };

    private double priceGenerator() {
        System.out.printf("%s generating price %n", Thread.currentThread().getName());
        delay();
        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    };

    private  void delay() {
        try {
            int milli = ThreadLocalRandom.current().nextInt(200, 2500);
            TimeUnit.MILLISECONDS.sleep(milli);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
