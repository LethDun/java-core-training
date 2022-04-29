package com.ec.oop.testoop;

public class Test {

    public static void main(String[] args) {

        Animal cat = new BritishCat("miu", 1);
        Animal dog = new Dog("kiki", "1.2m");

        cat.moving();
        cat.speaking();

        dog.moving();
        dog.speaking();

    }

}
