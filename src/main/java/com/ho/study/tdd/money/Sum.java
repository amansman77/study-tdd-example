package com.ho.study.tdd.money;

public class Sum implements Expression {

    public Money augend;
    public Money addend;
    
    public Sum(Money augend, Money addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(String to) {
        int amout = this.augend.amount + addend.amount;
        return new Money(amout, to);
    }

}
