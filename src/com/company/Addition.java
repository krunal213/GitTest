package com.company;

public class Addition implements Operation {

    //number 1
    private final int number1;
    //number 2
    private final int number2;

    public Addition(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int getResult() {
        return number1 + number2;
    }

}
