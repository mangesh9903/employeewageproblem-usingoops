package com.bridgelabz.employeewageproblem.serviceimplementation;

import com.bridgelabz.employeewageproblem.model.EmployeeWage;
import com.bridgelabz.employeewageproblem.service.Service;

public class ServiceImp implements Service {

EmployeeWage employeeWage = new EmployeeWage();

    @Override
    public boolean checkEmployee() {
        return false;
    }
}
