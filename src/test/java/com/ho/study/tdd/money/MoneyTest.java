package com.ho.study.tdd.money;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MoneyTest {
    
    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar product = five.time(2);
        assertEquals(10, product.amount);
        product = five.time(3);
        assertEquals(15, product.amount);
    }
}
