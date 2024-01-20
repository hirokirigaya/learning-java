package co.danieldev.oneforall.javacore.ZZAconcurrent.domain;

public class Account {
    private int balance = 50;

    public void withdrawal(int amount) {
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
