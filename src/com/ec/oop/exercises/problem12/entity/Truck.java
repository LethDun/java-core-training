package com.ec.oop.exercises.problem12.entity;

public class Truck extends Vehicle {

    private int tonage;

    public Truck() {
    }

    public Truck(int id, String manufacturer, int manufacturingYear, long price, String color,
        int tonage) {
        super(id, manufacturer, manufacturingYear, price, color);
        this.tonage = tonage;
    }

    public int getTonage() {
        return tonage;
    }

    public void setTonage(int tonage) {
        this.tonage = tonage;
    }

    @Override
    public String toString() {
        return "Truck{" +
            "id=" + id +
            ", manufacturer='" + manufacturer + '\'' +
            ", manufacturingYear=" + manufacturingYear +
            ", price=" + price +
            ", color='" + color + '\'' +
            ", tonage=" + tonage +
            '}';
    }
}
