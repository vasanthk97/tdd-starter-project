package com.tdd;

public class Franc extends Money{
    public Franc(int amount ,String currency) {
        this.amount = amount;
        this.currency = currency;
    }



    public Money times(int number){
        return new Dollar(this.amount*number,"CHF");

    }



}
