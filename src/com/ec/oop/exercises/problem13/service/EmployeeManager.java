package com.ec.oop.exercises.problem13.service;

import com.ec.oop.exercises.problem13.entity.Employee;
import com.ec.oop.exercises.problem13.entity.Experience;
import com.ec.oop.exercises.problem13.entity.Fresher;
import com.ec.oop.exercises.problem13.entity.Intern;
import com.ec.oop.exercises.problem13.exception.IdNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManager {

    private HashMap<String, Employee> employees;

    public EmployeeManager() {
        this.employees = new HashMap<>();
    }

    public HashMap<String, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(
        HashMap<String, Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public List<Employee> getEmployeeList() {
        return employees.entrySet()
                        .stream()
                        .map(entry -> entry.getValue())
                        .collect(Collectors.toList());
    }

    public Employee findById(String id) {
        return this.getEmployeeList().stream()
            .filter(e -> e.getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new IdNotFoundException("ID not found!"));
    }

    public boolean removeById(String id) {
        Employee employee = this.findById(id);
        return employees.remove(employee.getId(), employee);
    }



    /**
     * 0 - Experience
     * 1 - Fresher
     * 2 - Intern
     * @param type
     * @return List of employees by type
     */
    public List<Employee> findByType(int type) {
        return this.getEmployeeList().stream()
                    .filter(e -> {
                        if (type == 0) {
                            return e instanceof Experience;
                        }
                        if (type == 1) {
                            return e instanceof Fresher;
                        }
                        if (type == 2) {
                            return e instanceof Intern;
                        }
                        return false;
                    })
                    .collect(Collectors.toList());
    }

}
