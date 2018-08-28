package com.tdd;

public class Money {
    protected int amount;

    public Money() {
    }

    public Money(int amount) {
        this.amount = amount;
    }
    public boolean equals(Object obj){
        Money money= (Money) obj;

        return this.amount == money.amount && getClass().equals(money.getClass());
    }
}
