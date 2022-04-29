package com.ec.oop.exercises.problem3.model;

public class StudentA extends Student{

    private static final String subjects = "Toán, Lý, Hoá";

    public StudentA(String id, String name, String address, String priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "StudentA{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", priority=" + priority + '\'' +
            ", subjects=" + subjects +
            '}';
    }
}
