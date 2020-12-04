package com.visitor.employeeDetails;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class EmployeeFormatterTests {

    public static List<Employee> employeeList = null;

    @BeforeAll
    public static void setup() throws Exception {

        employeeList = List.of(
                new SalariedEmployee("Employee1", 28000F),
                new CommissionedEmployee("Employee2", 12000, 2),
                new MixedSalariedEmployee("Employee3", 20000, 1000, 1.5F)
        );
    }

    @Test
    public void formatToJson() {

        for (var employee : employeeList){
            try {
                System.out.println(employee.getName() + ": " + employee.formatToJson(new EmployeeFormatterImpl()));
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
        }
    }

}
