package com.ho.study.tdd.money;

public class Dollar extends Money {

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar time(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
