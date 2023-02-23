package com.ho.study.tdd.money;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {
    
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.time(2);
        assertEquals(10, five.amount);
    }
}
