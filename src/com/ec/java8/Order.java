package com.ec.java8;

public class Order {

    private int id;
    private String name;
    private int value;
    private String type;

    public Order(int id, String name, int value, String type) {
        this.id = id;
        this.name = name;
        this.value = value;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Order{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", value=" + value +
            ", type='" + type + '\'' +
            '}';
    }
}
