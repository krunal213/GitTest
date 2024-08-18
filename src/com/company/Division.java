package com.company;

public class Division implements Operation {

    private final int number1;
    private final int number2;

    public Division(int number1, int number2) throws Exception {
        if(number2 == 0)
            throw new Exception("Number 2 should not be zero");
        this.number1 = number1;
        this.number2 = number2;
    }

    @Override
    public int getResult() {
        return number1 / number2;
    }
}
