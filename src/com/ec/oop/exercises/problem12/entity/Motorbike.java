package com.ec.oop.exercises.problem12.entity;

public class Motorbike extends Vehicle {

    private int power;

    public Motorbike() {
    }

    public Motorbike(int id, String manufacturer, int manufacturingYear, long price,
        String color, int power) {
        super(id, manufacturer, manufacturingYear, price, color);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Motorbike{" +
            "id=" + id +
            ", manufacturer='" + manufacturer + '\'' +
            ", manufacturingYear=" + manufacturingYear +
            ", price=" + price +
            ", color='" + color + '\'' +
            ", power=" + power +
            '}';
    }
}
