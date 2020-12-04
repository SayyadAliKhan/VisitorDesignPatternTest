package com.visitor.employeeDetails;

import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SalaryCalculatorTests {

    public static List<Employee> employeeList = null;

    @BeforeAll
    public static void setup() throws Exception {

        employeeList = List.of(
                new SalariedEmployee("Employee1", 28000),
                new CommissionedEmployee("Employee2", 12000, 2),
                new MixedSalariedEmployee("Employee3", 20000, 1000, 1.5F)
        );
    }


    @Test
    public void calculateSalary() {

        double totalSalary = 0;
        for (var employee : employeeList){
            totalSalary += employee.calculateTotalSalary(new SalaryCalculatorImpl());
        }

        int size = employeeList.isEmpty() ? 0 : employeeList.size();

        assertEquals(3, size);

        System.out.println("Total Salary of " + size + " employee is: " + totalSalary);

    }

}
