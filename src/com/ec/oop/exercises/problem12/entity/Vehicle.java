package com.ec.oop.exercises.problem12.entity;

public class Vehicle {

    protected int id;
    protected String manufacturer;
    protected int manufacturingYear;
    protected long price;
    protected String color;

    public Vehicle() {
    }

    public Vehicle(int id, String manufacturer, int manufacturingYear, long price,
        String color) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.manufacturingYear = manufacturingYear;
        this.price = price;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getManufacturingYear() {
        return manufacturingYear;
    }

    public void setManufacturingYear(int manufacturingYear) {
        this.manufacturingYear = manufacturingYear;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
