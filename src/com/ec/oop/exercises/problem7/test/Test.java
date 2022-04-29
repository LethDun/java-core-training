package com.ec.oop.exercises.problem7.test;

import com.ec.oop.exercises.problem7.models.Teacher;
import com.ec.oop.exercises.problem7.models.TeacherManager;

public class Test {

    public static void main(String[] args) {
        TeacherManager teacherManager = new TeacherManager();
        Teacher teacher1 = new Teacher("nvA", 43, "HN", 1, 500, 200, 150);
        Teacher teacher2 = new Teacher("lvT", 54, "DN", 2, 700, 500, 100);
        Teacher teacher3 = new Teacher("ttD", 34, "SG", 3, 400, 70, 0);

        teacherManager.addTeacher(teacher1);
        teacherManager.addTeacher(teacher2);
        teacherManager.addTeacher(teacher3);

        System.out.println(teacherManager.getTeachers());

        System.out.println(teacherManager.removeTeacherById(1));
        System.out.println(teacherManager.getTeachers());

        teacherManager.getSalaryById(2);
    }
}
