package com.ec.oop.exercises.problem15;

import com.ec.oop.exercises.problem15.entity.Department;
import com.ec.oop.exercises.problem15.entity.InserviceStudent;
import com.ec.oop.exercises.problem15.entity.Result;
import com.ec.oop.exercises.problem15.entity.Student;

public class DemoApp {

    public static void main(String[] args) {

        Student s1 = new Student("1", "NvA", "11/02/2000", 2017, 4.5);
        Result r1 = new Result("2a", 3.5);
        Result r2 = new Result("2b", 3.1);
        Result r3 = new Result("3a", 2.3);
        s1.addResult(r1);
        s1.addResult(r3);
        s1.addResult(r2);
        System.out.println(s1);

        Student s2 = new InserviceStudent("2", "nvB", "30/04/1997", 2015, 2.8, "HN");
        Result r4 = new Result("3a", 4.0);
        s2.addResult(r4);

        Student s3 = new InserviceStudent("3", "nvC", "01/05/1999", 2017, 3.8, "HN");
        Result r5 = new Result("3a", 3.8);
        s3.addResult(r5);

        Department department = new Department("CNTT");

        department.addStudent(s1);
        department.addStudent(s2);
        department.addStudent(s3);
        department.showInfo();

        System.out.println("check type\n" + department.studentType("2"));
        System.out.println("regular student counter\n" + department.regularStudentCounter());
        System.out.println("highest entry point\n" + department.highestEntryPoint());
        System.out.println("get list with gpa higher than\n" + department.getListStudentWithGpa(2.5));
        System.out.println("highest gpa \n" + department.highestGpaStudent());
        System.out.println("get list regular student\n" + department.regularStudents());
        System.out.println("get list inservice student\n" + department.inserviceStudents());
        System.out.println("find students by location\n" + department.findStudentsByLocation("HN"));
        System.out.println("sort by admission year\n" + department.sortByAdmissionYear());
        System.out.println("Student count by Year: ");
        department.studentCountByAdmissionYear();
    }
}
