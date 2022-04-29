package com.ec.oop.exercises.problem11;

public class Test {

    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber(2.5, 1.3);
        ComplexNumber n2 = new ComplexNumber(1.5, 3.2);

        System.out.println(n1);
        System.out.println(n2);

        System.out.println(Calculator.sum(n1, n2));
        System.out.println(Calculator.subtract(n1, n2));
        System.out.println(Calculator.multiply(n1, n2));
    }

}
