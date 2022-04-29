package com.ec.oop.testoop;

public abstract class Cat implements Animal{

    protected String name;

    protected int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void catEating();

    @Override
    public void moving() {
        System.out.println("Cat is running");
    }

    @Override
    public void speaking() {
        System.out.println("Mew mew");
    }
}
