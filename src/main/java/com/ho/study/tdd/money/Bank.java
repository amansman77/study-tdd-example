package com.ho.study.tdd.money;

public class Bank {

    public Money reduce(Expression source, String to) {
        return source.reduce(to);
    }
    
}
