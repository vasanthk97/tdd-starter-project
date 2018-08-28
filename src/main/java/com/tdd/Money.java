package com.tdd;

abstract public class Money {
    protected int amount;

    public Money() {
    }

    public Money(int amount) {
        this.amount = amount;
    }

    public abstract Money times(int amount);

    public boolean equals(Object obj){
        Money money= (Money) obj;

        return this.amount == money.amount && getClass().equals(money.getClass());
    }

    public static Money getDollar(int amount){
        return new Dollar(amount);
    }
    public static Money getFranc(int amount){
        return new Franc(amount);
    }
}
