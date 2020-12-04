package com.visitor.employeeDetails;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeFormatterImpl implements EmployeeFormatter {

    ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public String formatToJSON(SalariedEmployee salariedEmployee) throws JsonProcessingException {

        return objectMapper.writeValueAsString(salariedEmployee);
    }

    @Override
    public String formatToJSON(CommissionedEmployee commissionedEmployee) throws JsonProcessingException {

        return objectMapper.writeValueAsString(commissionedEmployee);
    }

    @Override
    public String formatToJSON(MixedSalariedEmployee mixedSalariedEmployee) throws JsonProcessingException {

        return objectMapper.writeValueAsString(mixedSalariedEmployee);
    }

}
