package com.ec.oop.exercises.problem3.model;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> listStudents;

    public StudentManager() {
        this.listStudents = new ArrayList<>();
    }

    public StudentManager(List<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public void addStudent(Student student) {
        boolean check = listStudents.stream()
            .map(Student::getId)
            .anyMatch(id -> id.equals(student.getId()));
        if (check) {
            System.out.println("Đã tồn tại thí sinh có SBD: " + student.getId());
            return;
        }
        listStudents.add(student);
    }

    public void showStudentsInfo() {
        listStudents.forEach(System.out::println);
    }

    public Student searchById(String id) {
        return listStudents.stream()
            .filter(student -> student.getId().equals(id))
            .findFirst()
            .orElse(null);
    }


}
