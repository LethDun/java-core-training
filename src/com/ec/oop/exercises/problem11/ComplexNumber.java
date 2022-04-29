package com.ec.oop.exercises.problem11;

public class ComplexNumber {

    private double real;
    private double img;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImg() {
        return img;
    }

    public void setImg(double img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return String.format("%.2f", real) + " " + String.format("%.2f", img) + "i";
    }
}
