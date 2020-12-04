package com.visitor.employeeDetails;

import com.fasterxml.jackson.core.JsonProcessingException;

public class MixedSalariedEmployee extends Employee{

    private double salary;
    private int noOfSales;
    private float rate;

    public MixedSalariedEmployee(String name, double salary, int noOfSales, float rate) {
        super(name);
        this.salary = salary;
        this.noOfSales = noOfSales;
        this.rate = rate;
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

    public int getNoOfSales() {
        return noOfSales;
    }

    public float getRate() {
        return rate;
    }
}
