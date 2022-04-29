package com.ec.oop.exercises.problem13.entity;

import com.ec.oop.exercises.problem13.util.DateConverter;
import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee{

    private LocalDate graduationDate;
    private String rank;
    private String university;

    public Fresher() {
        ++counter;
    }

    public Fresher(String id, String fullName, String birthDay, String phone, String email,
        List<Certificate> certificates, String graduationDate, String rank,
        String university) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.graduationDate = DateConverter.stringToDate(graduationDate);
        this.rank = rank;
        this.university = university;
        ++counter;
    }

    public Fresher(Employee basicInfo, String graduationDate, String rank,
        String university) {
        this.id = basicInfo.id;
        this.fullName = basicInfo.fullName;
        this.birthDay = basicInfo.birthDay;
        this.phone = basicInfo.phone;
        this.email = basicInfo.email;
        this.certificates = basicInfo.certificates;
        this.graduationDate = DateConverter.stringToDate(graduationDate);
        this.rank = rank;
        this.university = university;
        ++counter;
    }

    public LocalDate getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(LocalDate graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
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
        return "Fresher{" +
            "id = " + id + "\n" +
            "fullName = " + fullName + "\n" +
            "birthDay = " + DateConverter.dateToString(birthDay) + "\n" +
            "phone = " + phone + "\n" +
            "email = " + email + "\n" +
            "certificates = " + certificates + "\n" +
            "graduationDate = " + DateConverter.dateToString(graduationDate) + "\n" +
            "rank = " + rank + "\n" +
            "university = " + university + '\'' +
            '}' + "\n";
    }
}
