package com.tdd;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int number){
        return new Dollar(this.amount*number);

    }

    public boolean equals(Object obj){
        Dollar dollar = (Dollar)obj;

        return this.amount == dollar.amount;
    }

}
