package com.ec.oop.exercises.problem3.model;

public class StudentB extends Student{

    private static final String subjects = "Toán, Hoá, Sinh";

    public StudentB(String id, String name, String address, String priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "StudentB{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", priority=" + priority + '\'' +
            ", subjects=" + subjects +
            '}';
    }
}
