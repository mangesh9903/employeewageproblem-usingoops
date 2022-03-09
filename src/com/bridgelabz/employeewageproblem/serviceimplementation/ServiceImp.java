package com.bridgelabz.employeewageproblem.serviceimplementation;

import com.bridgelabz.employeewageproblem.model.EmployeeWage;
import com.bridgelabz.employeewageproblem.service.Service;

public class ServiceImp implements Service {

    EmployeeWage employeeWage = new EmployeeWage();


    /**
     * UseCase1  Checking Employee is Present Or Abscent.
     *
     * @return result
     */
    @Override
    public boolean checkEmployee() {
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == EmployeeWage.IS_FULL_TIME) {
            System.out.println("Employee  is Present.");
            return true;
        } else {
            System.out.println("Employee is Abscent");
        }
        return false;
    }

    /**
     * UseCase2 Calculating Employee Salary
     *
     * @return returning salary
     */
    @Override
    public float calculateEmployeeWage() {
        float salary = 0;
        if (checkEmployee()) {
            int emphrs = 8;
            employeeWage.setEmpRatePerHour(20);
            salary = (employeeWage.getEmpRatePerHour() * emphrs);
            return salary;
        } else
            salary = 0;
        return salary;
    }
}
