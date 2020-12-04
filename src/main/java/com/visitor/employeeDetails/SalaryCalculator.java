package com.visitor.employeeDetails;

public interface SalaryCalculator {

    double calculateTotalSalary(SalariedEmployee account);
    double calculateTotalSalary(CommissionedEmployee account);
    double calculateTotalSalary(MixedSalariedEmployee account);

}
