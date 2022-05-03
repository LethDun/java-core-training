package com.ec.oop.exercises.problem15.entity;

import java.util.*;
import java.util.stream.Collectors;

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
        students.values().stream()
                .forEach(System.out::println);
    }

    public Student findById(String id) {
        return students.values().stream()
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
        return !(student instanceof InserviceStudent);
    }

    public int regularStudentCounter() {
        int counter =
                (int) students.values().stream()
                        .filter(stu -> stu instanceof InserviceStudent)
                        .count();
        return students.size() - counter;
    }

    public Student highestEntryPoint() {
        return students.values().stream()
                .max((o1, o2) -> (int) (o1.getEntryPoint() - o2.getEntryPoint()))
                .orElse(null);
    }

    public List<Student> getListStudentWithGpa(double gpa) {
        return students.values().stream()
                .filter(s -> s.getResults().get(0).getGpa() >= gpa)
                .collect(Collectors.toList());
    }

    public Student highestGpaStudent() {
        TreeMap<Double, Student> bestGpaStudent = new TreeMap<>();
        students.values().stream()
                .forEach(s -> {
                    s.getResults().sort((r1, r2) -> (int) (r1.getGpa() - r2.getGpa()));
                    bestGpaStudent.put(s.getResults().get(0).getGpa(), s);
                });
        return bestGpaStudent.lastEntry().getValue();
    }

    public List<Student> regularStudents() {
        return students.values().stream()
                .filter(s -> !(s instanceof InserviceStudent))
                .collect(Collectors.toList());
    }
    public List<Student> inserviceStudents() {
        return students.values().stream()
                .filter(s -> s instanceof InserviceStudent)
                .collect(Collectors.toList());
    }


    public List<InserviceStudent> findStudentsByLocation(String location) {
        List<InserviceStudent> inserviceStudentList =
                this.inserviceStudents().stream()
                        .map(s -> (InserviceStudent) s)
                        .collect(Collectors.toList());
        return inserviceStudentList.stream()
                .filter(s -> s.getLocation().equalsIgnoreCase(location))
                .collect(Collectors.toList());
    }

    public List<Student> sortByAdmissionYear() {
        return students.values().stream()
                .sorted((s1, s2) -> s2.getAdmissionYear() - s1.getAdmissionYear())
                .collect(Collectors.toList());
    }
    public void studentCountByAdmissionYear() {
        TreeSet<Integer> yearSet = new TreeSet<>();
        students.values().stream()
                .forEach(s -> yearSet.add(s.getAdmissionYear()));
        yearSet.stream()
                .forEach(year -> {
                    long c = students.values().stream()
                            .filter(s -> s.getAdmissionYear() == year)
                            .count();
                    System.out.println(year + ": " + c);
                });
    }
}
