package com.ec.oop.exercises.problem9.models;

public class ElectricalBill {

    private Customer customer;
    private int oldIndicator;
    private int newIndicator;

    public ElectricalBill() {
    }

    public ElectricalBill(Customer customer, int oldIndicator, int newIndicator) {
        this.customer = customer;
        this.oldIndicator = oldIndicator;
        this.newIndicator = newIndicator;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOldIndicator() {
        return oldIndicator;
    }

    public void setOldIndicator(int oldIndicator) {
        this.oldIndicator = oldIndicator;
    }

    public int getNewIndicator() {
        return newIndicator;
    }

    public void setNewIndicator(int newIndicator) {
        this.newIndicator = newIndicator;
    }

    public int getPayment() {
        return 5 * (newIndicator - oldIndicator);
    }

    public void updateCustomer(String name, String address, String meterId) {
        this.setCustomer(new Customer(name, address, meterId));
    }

    @Override
    public String toString() {
        return "ElectricalBill{" +
            "customer=" + customer +
            ", oldIndicator=" + oldIndicator +
            ", newIndicator=" + newIndicator +
            ", payment=" + this.getPayment() +
            '}';
    }
}
