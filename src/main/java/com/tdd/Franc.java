package com.tdd;

public class Franc {
    private int amount;

    public Franc(int amount) {
        this.amount = amount;
    }

    public Dollar times(int number){
        return new Dollar(this.amount*number);

    }

    public boolean equals(Object obj){
        Franc franc= (Franc) obj;

        return this.amount == franc.amount;
    }

}
