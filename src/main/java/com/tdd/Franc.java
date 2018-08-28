package com.tdd;

public class Franc extends Money{
    public Franc(int amount ,String currency) {
        super(amount,currency);

    }



    public Money times(int number){
        return new Dollar(this.amount*number,this.currency);

    }



}
