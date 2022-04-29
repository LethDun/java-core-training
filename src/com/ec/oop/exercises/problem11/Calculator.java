package com.ec.oop.exercises.problem11;

public class Calculator {

    public static ComplexNumber sum(ComplexNumber n1, ComplexNumber n2) {
        //(a + a') + (b + b')i
        ComplexNumber n3 = new ComplexNumber();
        n3.setReal(n1.getReal() + n2.getReal());
        n3.setImg(n1.getImg() + n2.getImg());
        return n3;
    }

    public static ComplexNumber subtract(ComplexNumber n1, ComplexNumber n2) {
        //(a - a') + (b - b')i
        ComplexNumber n3 = new ComplexNumber();
        n3.setReal(n1.getReal() - n2.getReal());
        n3.setImg(n1.getImg() - n2.getImg());
        return n3;
    }

    public static ComplexNumber multiply(ComplexNumber n1, ComplexNumber n2) {
        //(a + bi)(a' + b'i) = aa' - bb' + (ab' + a'b)i
        ComplexNumber n3 = new ComplexNumber();
        n3.setReal(n1.getReal() * n2.getReal() - n1.getImg() * n2.getImg());
        n3.setImg(n1.getReal() * n2.getImg() + n2.getReal() * n1.getImg());
        return n3;
    }

}
