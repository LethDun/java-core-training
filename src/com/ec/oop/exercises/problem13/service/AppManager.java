package com.ec.oop.exercises.problem13.service;

import com.ec.oop.exercises.problem13.entity.Employee;
import com.ec.oop.exercises.problem13.entity.Experience;
import com.ec.oop.exercises.problem13.entity.Fresher;
import com.ec.oop.exercises.problem13.entity.Intern;
import com.ec.oop.exercises.problem13.exception.BirthDayException;
import com.ec.oop.exercises.problem13.exception.EmailException;
import com.ec.oop.exercises.problem13.exception.FullNameException;
import com.ec.oop.exercises.problem13.exception.IdNotFoundException;
import com.ec.oop.exercises.problem13.exception.PhoneException;
import com.ec.oop.exercises.problem13.util.ScannerFactory;
import java.util.Scanner;

public class AppManager {

    private EmployeeManager employeeManager;

    public AppManager() {
        this.employeeManager = new EmployeeManager();
    }

    /**
     * 0 - Experience 1 - Fresher 2 - Intern
     *
     * @param
     * @return
     */
    public void insertEmployeeByType() {
        System.out.println("Enter type (0/1/2):");
        int type = new Scanner(System.in).nextInt();
        Employee employee = null;
        if (type == 0) {
            employee = this.createExperience();
        }
        if (type == 1) {
            employee = this.createFresher();
        }
        if (type == 2) {
            employee = this.createIntern();
        }

        try {
            checkData(employee);
        } catch (PhoneException e) {
            e.printStackTrace();
            insertEmployeeByType();
        } catch (FullNameException e) {
            e.printStackTrace();
            insertEmployeeByType();
        } catch (EmailException e) {
            e.printStackTrace();
            insertEmployeeByType();
        } catch (BirthDayException e) {
            e.printStackTrace();
            insertEmployeeByType();
        }
        employeeManager.addEmployee(employee);
        System.out.println("Insert Successfully!");
    }

    public Employee findByIdApp(String id) {
        Employee employee = null;
        try {
            employee = employeeManager.findById(id);
        } catch (IdNotFoundException e) {
            e.printStackTrace();
        }
        return employee;
    }

    public void showAll() {
        employeeManager.getEmployeeList()
            .forEach(System.out::println);
    }

    public void update() {
        System.out.println("Enter Id to update:");
        String id = new Scanner(System.in).nextLine();
        Employee employee = this.findByIdApp(id);
        if (employee != null) {
            if (employee instanceof Experience) {
                employee = this.createExperience();
            }
            if (employee instanceof Fresher) {
                employee = this.createFresher();
            }
            if (employee instanceof Intern) {
                employee = this.createIntern();
            }

            try {
                checkData(employee);
            } catch (PhoneException e) {
                e.printStackTrace();
                update();
            } catch (FullNameException e) {
                e.printStackTrace();
                update();
            } catch (EmailException e) {
                e.printStackTrace();
                update();
            } catch (BirthDayException e) {
                e.printStackTrace();
                update();
            }
            employeeManager.addEmployee(employee);
        }
    }

    public boolean delete() {
        Scanner s = ScannerFactory.getScanner();
        System.out.println("Enter Id to delete:");
        String id = s.nextLine();
        return employeeManager.removeById(id);
    }

    private void checkData(Employee employee)
        throws FullNameException, BirthDayException, EmailException, PhoneException {
        Validator.nameCheck(employee.getFullName());
        Validator.birthDayCheck(employee.getBirthDay());
        Validator.phoneCheck(employee.getPhone());
        Validator.emailCheck(employee.getEmail());
    }

    private Employee createExperience() {
        Scanner s = ScannerFactory.getScanner();
        Employee basicInfo = this.basicInfo();
        System.out.println("Exp in Year:");
        int expInYear = new Scanner(System.in).nextInt();
        System.out.println("Pro skill:");
        String proSkill = s.nextLine();
        return new Experience(basicInfo, expInYear, proSkill);
    }

    private Employee createFresher() {
        Scanner s = ScannerFactory.getScanner();
        Employee basicInfo = this.basicInfo();
        System.out.println("Graduation Date:");
        String gradDate = s.nextLine();
        System.out.println("Graduation Rank:");
        String gradRank = s.nextLine();
        System.out.println("University:");
        String university = s.nextLine();
        return new Fresher(basicInfo, gradDate, gradRank, university);
    }

    private Employee createIntern() {
        Scanner s = ScannerFactory.getScanner();
        Employee basicInfo = this.basicInfo();
        System.out.println("Major:");
        String major = s.nextLine();
        System.out.println("Semester:");
        String semester = s.nextLine();
        System.out.println("University:");
        String university = s.nextLine();
        return new Intern(basicInfo, major, semester, university);
    }

    private Employee basicInfo() {
        Scanner s = ScannerFactory.getScanner();
        System.out.println("Id:");
        String id = s.nextLine();
        System.out.println("Full Name:");
        String name = s.nextLine();
        System.out.println("Birth Day (dd/MM/yyyy):");
        String birthDay = s.nextLine();
        System.out.println("Phone:");
        String phone = s.nextLine();
        System.out.println("Email:");
        String email = s.nextLine();

        return new Employee(id, name, birthDay, phone, email, null) {
            @Override
            public void showInfo() {

            }
        };
    }
}
