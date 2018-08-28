package com.tdd;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money() {
    }

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }


    public boolean equals(Object obj){
        Money money= (Money) obj;

        return this.amount == money.amount && getClass().equals(money.getClass());
    }
    public String getCurrency(){
        return this.currency;
    }
    public static Money getDollar(int amount){
        return new Dollar(amount,"USD");
    }
    public static Money getFranc(int amount){
        return new Franc(amount,"CHF");
    }

    public Money times(int multiplier){
        return new Money(amount*multiplier,currency);
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    public Expression plus(Money addend) {
        return new Money(amount+addend.amount,currency);
    }
}
