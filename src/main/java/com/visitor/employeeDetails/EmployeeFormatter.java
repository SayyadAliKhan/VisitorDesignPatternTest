package com.visitor.employeeDetails;

import com.fasterxml.jackson.core.JsonProcessingException;

public interface EmployeeFormatter {

    String formatToJSON(SalariedEmployee salariedEmployee) throws JsonProcessingException;
    String formatToJSON(CommissionedEmployee commissionedEmployee) throws JsonProcessingException;
    String formatToJSON(MixedSalariedEmployee mixedSalariedEmployee) throws JsonProcessingException;

}
