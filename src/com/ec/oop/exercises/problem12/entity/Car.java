package com.ec.oop.exercises.problem12.entity;

public class Car extends Vehicle {

    private int numberOfSeat;
    private String engine;

    public Car() {
    }

    public Car(int id, String manufacturer, int manufacturingYear, long price, String color,
        int numberOfSeat, String engine) {
        super(id, manufacturer, manufacturingYear, price, color);
        this.numberOfSeat = numberOfSeat;
        this.engine = engine;
    }

    public int getNumberOfSeat() {
        return numberOfSeat;
    }

    public void setNumberOfSeat(int numberOfSeat) {
        this.numberOfSeat = numberOfSeat;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
            "id=" + id +
            ", manufacturer='" + manufacturer + '\'' +
            ", manufacturingYear=" + manufacturingYear +
            ", price=" + price +
            ", color='" + color + '\'' +
            ", numberOfSeat=" + numberOfSeat +
            ", engine='" + engine + '\'' +
            '}';
    }
}
