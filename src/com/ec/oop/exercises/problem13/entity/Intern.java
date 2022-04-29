package com.ec.oop.exercises.problem13.entity;

import com.ec.oop.exercises.problem13.util.DateConverter;
import java.util.List;

public class Intern extends Employee{

    private String major;
    private String semester;
    private String university;

    public Intern() {
        ++counter;
    }

    public Intern(String id, String fullName, String birthDay, String phone,
        String email, List<Certificate> certificates, String major, String semester,
        String university) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.major = major;
        this.semester = semester;
        this.university = university;
        ++counter;
    }

    public Intern(Employee basicInfo, String major,
        String semester, String university) {
        this.id = basicInfo.id;
        this.fullName = basicInfo.fullName;
        this.birthDay = basicInfo.birthDay;
        this.phone = basicInfo.phone;
        this.email = basicInfo.email;
        this.certificates = basicInfo.certificates;
        this.major = major;
        this.semester = semester;
        this.university = university;
        ++counter;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Intern{" +
            "id = " + id + "\n" +
            "fullName = " + fullName + "\n" +
            "birthDay = " + DateConverter.dateToString(birthDay) + "\n" +
            "phone = " + phone + "\n" +
            "email = " + email + "\n" +
            "certificates = " + certificates + "\n" +
            "major = " + major + "\n" +
            "semester = " + semester + "\n" +
            "university = " + university + '\'' +
            '}' + "\n";
    }
}
