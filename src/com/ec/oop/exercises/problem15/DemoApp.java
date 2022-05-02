package com.ec.oop.exercises.problem15;

import com.ec.oop.exercises.problem15.entity.Department;
import com.ec.oop.exercises.problem15.entity.InserviceStudent;
import com.ec.oop.exercises.problem15.entity.Student;

public class DemoApp {

    public static void main(String[] args) {

        Student s1 = new Student("1", "NvA", "11/02/2000", 2016, 4.5);

        Student s2 = new InserviceStudent("2", "nvB", "30/04/1997", 2015, 2.8, "HN");

        Student s3 = new InserviceStudent("3", "nvC", "01/05/1999", 2016, 3.8, "HN");

        Department department = new Department("CNTT");

        department.addStudent(s1);
        department.addStudent(s2);
        department.addStudent(s3);
        department.showInfo();

        System.out.println(department.studentType("2"));
        System.out.println(department.regularStudentCounter());
    }

}
