package com.ec.oop.exercises.problem3.model;

public class Student {

    protected String id;
    protected String name;
    protected String address;
    protected String priority;

    public Student() {
    }

    public Student(String id, String name, String address, String priority) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }
}
