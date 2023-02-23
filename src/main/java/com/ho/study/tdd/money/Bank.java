package com.ho.study.tdd.money;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Pair, Integer> rates = new HashMap<>();
    
    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public void addRate(String from, String to, int rate) {
        this.rates.put(new Pair(from, to), rate);
    }

	public int rate(String from, String to) {
        if (from.equals(to)) {
            return 1;
        }
        Integer rate = this.rates.get(new Pair(from, to));
		return rate.intValue();
	}
    
}
