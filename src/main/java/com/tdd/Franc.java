package com.tdd;

public class Franc extends Money{

    public Franc(int amount) {
        this.amount = amount;
    }

    public Money times(int number){
        return new Dollar(this.amount*number);

    }



}
