package com.ec.oop.exercises.problem7.models;

public class Teacher extends Person {

    private int id;
    private int salary;
    private int bonus;
    private int penalty;

    public Teacher(String name, int age, String address, int id, int salary, int bonus, int penalty) {
        super(name, age, address);
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public int getRealSalary() {
        return salary + bonus - penalty;
    }

    @Override
    public String toString() {
        return "Teacher{" +
            "name='" + name + '\'' +
            ", age=" + age +
            ", address='" + address + '\'' +
            ", id=" + id +
            ", real salary=" + this.getRealSalary() +
            '}';
    }
}
