package controller;

import models.Calculator;

public class Controller {

    private static Calculator calculator;
    private static final int NUM1 = 10;
    private static final int NUM2 = 5;
    public static void main(String[] args) {
        calculator = new Calculator();
        System.out.println(calculator.sum(NUM1, NUM2));
        System.out.println(calculator.subtraction(NUM1, NUM2));
        System.out.println(calculator.multiplication(NUM1, NUM2));
        System.out.println(calculator.split(NUM1, NUM2));
    }
}
