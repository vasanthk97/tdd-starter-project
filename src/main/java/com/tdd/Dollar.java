package com.tdd;

public class Dollar {
    private int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int number){
        this.amount *= number;
    }

}
