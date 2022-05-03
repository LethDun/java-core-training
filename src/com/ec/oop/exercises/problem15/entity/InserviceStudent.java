package com.ec.oop.exercises.problem15.entity;

import java.time.LocalDate;

public class InserviceStudent extends Student{

    private String location;

    public InserviceStudent(String id, String name, String birthday, int admissionYear, double entryPoint, String location) {
        super(id, name, birthday, admissionYear, entryPoint);
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "InserviceStudent{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", admissionYear=" + admissionYear +
                ", entryPoint=" + entryPoint +
                ", results=" + results + '\'' +
                ", location='" + location +
                '}';
    }
}
