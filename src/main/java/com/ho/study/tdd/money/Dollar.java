package com.ho.study.tdd.money;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money time(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

}
