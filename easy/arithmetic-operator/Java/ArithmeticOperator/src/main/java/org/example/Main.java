package org.example;

public class Main {
    public static void main(String[] args) {
        var calculator = new ArithmeticOperators(3, 5);

        System.out.println(calculator.add());
        System.out.println(calculator.minus());
        System.out.println(calculator.product());
    }
}