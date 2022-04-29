package com.ec.oop.exercises.problem13.entity;

import com.ec.oop.exercises.problem13.util.DateConverter;
import java.util.List;

public class Experience extends Employee{

    private int expInYear;
    private String proSkill;

    public Experience() {
        ++counter;
    }

    public Experience(String id, String fullName, String birthDay, String phone,
        String email, List<Certificate> certificates, int expInYear,
        String proSkill) {
        super(id, fullName, birthDay, phone, email, certificates);
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        ++counter;
    }

    public Experience(Employee basicInfo, int expInYear, String proSkill) {
        this.id = basicInfo.id;
        this.fullName = basicInfo.fullName;
        this.birthDay = basicInfo.birthDay;
        this.phone = basicInfo.phone;
        this.email = basicInfo.email;
        this.certificates = basicInfo.certificates;
        this.expInYear = expInYear;
        this.proSkill = proSkill;
        ++counter;
    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Experience{" +
            "id = " + id + "\n" +
            "fullName = " + fullName + "\n" +
            "birthDay = " + DateConverter.dateToString(birthDay) + "\n" +
            "phone = " + phone + "\n" +
            "email = " + email + "\n" +
            "certificates = " + certificates + "\n" +
            "expInYear = " + expInYear + "\n" +
            "proSkill = " + proSkill + '\'' +
            '}' + "\n";
    }
}
