package com.ec.oop.exercises.problem15.entity;

public class Result {

    private String semester;
    private double gpa;

    public Result() {
    }

    public Result(String semester, double gpa) {
        this.semester = semester;
        this.gpa = gpa;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Result{" +
                "semester='" + semester + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
