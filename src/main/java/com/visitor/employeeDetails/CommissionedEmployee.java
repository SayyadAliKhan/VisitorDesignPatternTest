package com.visitor.employeeDetails;

import com.fasterxml.jackson.core.JsonProcessingException;

public class CommissionedEmployee extends Employee {

    private int noOfSales;
    private float rate;

    public CommissionedEmployee(String name, int noOfSales, float rate) {
        super(name);
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

    public int getNoOfSales() {
        return noOfSales;
    }

    public float getRate() {
        return rate;
    }
}
