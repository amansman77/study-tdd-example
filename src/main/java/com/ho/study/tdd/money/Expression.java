package com.ho.study.tdd.money;

public interface Expression {

    Money reduce(Bank bank, String to);
    
}
