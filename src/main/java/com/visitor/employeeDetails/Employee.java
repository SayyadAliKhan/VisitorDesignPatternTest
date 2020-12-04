package com.visitor.employeeDetails;

import com.fasterxml.jackson.core.JsonProcessingException;

public abstract class Employee {

    private static int count = 0;
    private int id;
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public int getId() {
        return this.count++;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateTotalSalary(SalaryCalculator salaryCalculator);
    public abstract String formatToJson(EmployeeFormatter employeeFormatter) throws JsonProcessingException;


}
