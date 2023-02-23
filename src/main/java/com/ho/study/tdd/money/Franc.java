package com.ho.study.tdd.money;

public class Franc extends Money  {

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money time(int multiplier) {
        return Money.franc(amount * multiplier);
    }

}
