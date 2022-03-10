package com.bridgelabz.employeewageproblem.service;

import com.bridgelabz.employeewageproblem.model.Company;
import com.bridgelabz.employeewageproblem.model.EmployeeWage;

public interface Service {


    boolean checkEmployee();

    float calculateEmployeeWage();

    float calculateAllEmployeeWage();

    void calculateUsingSwitchCase();

    double empCheck();

    void calculateEmployeeWageForMonth();

    void calculateEmployeeWageTillCondition(EmployeeWage employeeWage);


}
