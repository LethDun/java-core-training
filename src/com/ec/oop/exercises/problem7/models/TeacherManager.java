package com.ec.oop.exercises.problem7.models;

import java.util.ArrayList;
import java.util.List;

public class TeacherManager {

    private List<Teacher> teachers;

    public TeacherManager() {
        this.teachers = new ArrayList<Teacher>();
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public boolean removeTeacherById(int id) {
        Teacher teacher = teachers.stream()
            .filter(t -> t.getId() == id)
            .findFirst()
            .orElse(null);

        if (teacher != null) {
            return teachers.remove(teacher);
        }
        return false;
    }

    public void getSalaryById(int id) {
        Teacher teacher = teachers.stream()
            .filter(t -> t.getId() == id)
            .findFirst()
            .orElse(null);
        if (teacher != null) {
            System.out.println(teacher.getRealSalary());
        } else {
            System.out.println("ID not found");
        }

    }
}
