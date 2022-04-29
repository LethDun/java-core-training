package com.ec.oop.exercises.problem9.models;

public class Customer {

    private String name;
    private String address;
    private String electricMeterId;

    public Customer() {
    }

    public Customer(String name, String address, String electricMeterId) {
        this.name = name;
        this.address = address;
        this.electricMeterId = electricMeterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getElectricMeterId() {
        return electricMeterId;
    }

    public void setElectricMeterId(String electricMeterId) {
        this.electricMeterId = electricMeterId;
    }

    @Override
    public String toString() {
        return "Customer{" +
            "name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", electricMeterId='" + electricMeterId + '\'' +
            '}';
    }
}
