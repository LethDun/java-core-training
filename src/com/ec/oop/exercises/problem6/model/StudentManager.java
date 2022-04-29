package com.ec.oop.exercises.problem6.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentManager {

    private List<Student> students;

    public StudentManager() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public boolean addStudent(Student student) {
        if (
            students.stream().anyMatch(s -> s.getId() == (student.getId()))
        ) {
            return false;
        }
        return students.add(student);
    }

    public List<Student> findStudentWithAge(int age) {
        return students.stream()
            .filter(s -> s.getAge() == age)
            .collect(Collectors.toList());
    }

    public long numberOfStudentWith(int age, String address) {
        return students.stream()
            .filter(s -> s.getAge() == age)
            .filter(s -> s.getAddress() == address)
            .count();
    }
}
