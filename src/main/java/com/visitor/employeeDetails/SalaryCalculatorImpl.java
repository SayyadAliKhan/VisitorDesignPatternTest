package com.visitor.employeeDetails;

public class SalaryCalculatorImpl implements SalaryCalculator {

    @Override
    public double calculateTotalSalary(SalariedEmployee account) { return account.getSalary(); }

    @Override
    public double calculateTotalSalary(CommissionedEmployee account) {
        return account.getNoOfSales() * account.getRate();
    }

    @Override
    public double calculateTotalSalary(MixedSalariedEmployee account) {
        return (account.getSalary() + (account.getNoOfSales() * account.getRate()));
    }

}
