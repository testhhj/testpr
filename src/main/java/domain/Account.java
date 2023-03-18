package domain;

import lombok.Data;

@Data
public class Account {

    private int balance;

    public Account(int balance) {
        this.balance = balance;
        validateBalance();
    }

    public Account() {
        this.balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int money) {
        this.balance += money;
    }

    private void validateBalance() {
        if (balance < 0) {
            throw new RuntimeException();
        }
    }
}
