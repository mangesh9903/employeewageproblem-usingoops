package com.bridgelabz.employeewageproblem.service;

import com.bridgelabz.employeewageproblem.model.Company;
import com.bridgelabz.employeewageproblem.model.EmployeeWage;

public interface Service {

    int IS_FULL_TIME = 2;
    int IS_PART_TIME = 1;

    boolean checkEmployee();

    float calculateEmployeeWage();

    float calculateAllEmployeeWage();

    void calculateUsingSwitchCase();

    double empCheck();

    void calculateEmployeeWageForMonth();

    void calculateEmployeeWageTillCondition(EmployeeWage employeeWage);


}
