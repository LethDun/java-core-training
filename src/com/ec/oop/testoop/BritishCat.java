package com.ec.oop.testoop;

public class BritishCat extends Cat{


    public BritishCat(String name, int age) {
        super(name, age);
    }

    @Override
    public void catEating() {
        System.out.println("cat eats fish");
    }
}
