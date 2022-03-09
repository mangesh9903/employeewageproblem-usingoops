package com.bridgelabz.employeewageproblem.serviceimplementation;

import com.bridgelabz.employeewageproblem.model.EmployeeWage;
import com.bridgelabz.employeewageproblem.service.Service;

public class ServiceImp implements Service {

    EmployeeWage employeeWage = new EmployeeWage();



    /** UseCase1  Checking Employee is Present Or Abscent.
     *
     * @return  result
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
}
