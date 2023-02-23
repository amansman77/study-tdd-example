package com.ho.study.tdd.money;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void time(int multiplier) {
        this.amount *= multiplier;
    }

}
