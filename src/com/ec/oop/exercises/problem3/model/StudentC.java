package com.ec.oop.exercises.problem3.model;

public class StudentC extends Student{

    private static final String subjects = "Văn, Sử, Địa";

    public StudentC(String id, String name, String address, String priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "StudentC{" +
            "id='" + id + '\'' +
            ", name='" + name + '\'' +
            ", address='" + address + '\'' +
            ", priority=" + priority + '\'' +
            ", subjects=" + subjects +
            '}';
    }
}
