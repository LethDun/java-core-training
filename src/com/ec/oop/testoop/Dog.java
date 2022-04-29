package com.ec.oop.testoop;

public class Dog implements Animal{

    private String name;

    private String hight;

    public Dog(String name, String hight) {
        this.name = name;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHight() {
        return hight;
    }

    public void setHight(String hight) {
        this.hight = hight;
    }

    @Override
    public void moving() {
        System.out.println("Dog is walking");
    }

    @Override
    public void speaking() {
        System.out.println("Bark!");
    }
}
