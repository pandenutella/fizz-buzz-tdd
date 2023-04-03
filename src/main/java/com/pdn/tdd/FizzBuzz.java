package com.pdn.tdd;

public class FizzBuzz {
    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        fizzBuzz.execute();
    }

    public void execute() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }

    public String getFizzBuzzValue(int number) {
        return String.valueOf(number);
    }
}
