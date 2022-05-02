package com.ec.oop.exercises.problem15.entity;

import com.ec.oop.exercises.problem15.util.DateConverter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {

    protected String id;
    protected String name;
    protected LocalDate birthday;
    protected int admissionYear;
    protected double entryPoint;
    protected List<Result> results;

    public Student() {
        this.results = new ArrayList<>();
    }

    public Student(String id, String name, String birthday, int admissionYear, double entryPoint) {
        this.id = id;
        this.name = name;
        this.birthday = DateConverter.stringToDate(birthday);
        this.admissionYear = admissionYear;
        this.entryPoint = entryPoint;
        this.results = new ArrayList<>();
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = DateConverter.stringToDate(birthday);
    }

    public int getAdmissionYear() {
        return admissionYear;
    }

    public void setAdmissionYear(int admissionYear) {
        this.admissionYear = admissionYear;
    }

    public double getEntryPoint() {
        return entryPoint;
    }

    public void setEntryPoint(double entryPoint) {
        this.entryPoint = entryPoint;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void addResult(Result result) {
        results.add(result);
    }

    public void getGpa(String semester) {
        Result result = results.stream()
                .filter(r -> r.getSemester().equals(semester))
                .findFirst()
                .orElse(null);
        if (result != null) {
            System.out.println("Semester: " + semester + " - " + "Gpa: " + result.getGpa());
        }
        System.out.println("No information");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", admissionYear=" + admissionYear +
                ", entryPoint=" + entryPoint +
                ", results=" + results +
                '}';
    }
}
