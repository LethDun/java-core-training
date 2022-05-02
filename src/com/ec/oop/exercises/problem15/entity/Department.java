package com.ec.oop.exercises.problem15.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Department {

    private String name;
    private HashMap<String, Student> students;

    public Department(String name) {
        this.name = name;
        this.students = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<String, Student> getStudents() {
        return students;
    }

    public void setStudents(HashMap<String, Student> students) {
        this.students = students;
    }

    public void showInfo() {
        students.entrySet().stream()
                .map(e -> e.getValue())
                .forEach(System.out::println);
    }

    public Student findById(String id) {
        return students.entrySet().stream()
                .map(e -> e.getValue())
                .filter(s -> s.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void addStudent(Student student) {
        students.put(student.getId(), student);
    }

    public boolean deleteById(String id) {
        Student student = findById(id);
        if (student != null) {
            return students.remove(student.getId(), student);
        }
        return false;
    }

    public boolean studentType(String id) {
        Student student = findById(id);
        if (student instanceof InserviceStudent) {
            return false;
        }
        return true;
    }

    public int regularStudentCounter() {
        int counter =
                (int) students.entrySet().stream()
                        .map(e -> e.getValue())
                        .filter(stu -> stu instanceof InserviceStudent)
                        .count();
        return students.size() - counter;
    }



}
