package com.visitor.employeeDetails;

import com.fasterxml.jackson.core.JsonProcessingException;

public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public double calculateTotalSalary(SalaryCalculator salaryCalculator) {
        return salaryCalculator.calculateTotalSalary(this);
    }

    @Override
    public String formatToJson(EmployeeFormatter employeeFormatter) throws JsonProcessingException {
        return employeeFormatter.formatToJSON(this);
    }

    public double getSalary() {
        return salary;
    }


}
