package com.ho.study.tdd.money;

public class Sum implements Expression {

    public Expression augend;
    public Expression addend;
    
    public Sum(Expression augend, Expression addend) {
        this.augend = augend;
        this.addend = addend;
    }

    public Money reduce(Bank bank, String to) {
        int amout = this.augend.reduce(bank, to).amount + this.addend.reduce(bank, to).amount;
        return new Money(amout, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(this.augend.times(multiplier), this.addend.times(multiplier));
    }

}
