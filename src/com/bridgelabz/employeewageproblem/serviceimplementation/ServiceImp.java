package com.bridgelabz.employeewageproblem.serviceimplementation;

import com.bridgelabz.employeewageproblem.model.Company;
import com.bridgelabz.employeewageproblem.model.EmployeeWage;
import com.bridgelabz.employeewageproblem.service.Service;

public class ServiceImp implements Service {

    Company company = new Company("D-Mart");
    EmployeeWage employeeWage = new EmployeeWage(company, 20, 20, 20);


    /**
     * UseCase1  Checking Employee is Present Or Abscent.
     *
     * @return result
     */
    @Override
    public boolean checkEmployee() {
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == employeeWage.IS_FULL_TIME) {
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

    /**
     * Usecase3 Calculating All Employee Wage
     *
     * @return result salary
     */
    public float calculateAllEmployeeWage() {
        float salary = 0;
        employeeWage.setEmpRatePerHour(20);
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == employeeWage.IS_FULL_TIME) {
            System.out.println("Employee  is Full Time.");
            int emphrs = 8;

            salary = (employeeWage.getEmpRatePerHour() * emphrs);
            return salary;
        } else if (empCheck == employeeWage.IS_PART_TIME) {

            System.out.println("Employee is Part Time");
            int emphrs = 4;

            salary = (employeeWage.getEmpRatePerHour() * emphrs);
            return salary;
        } else {
            System.out.println("Employee is Abscent");
            return salary = 0;
        }
    }

    /**
     * @return returing Result Whether It is Full Time Or Part Time Or Abscent
     */
    @Override
    public double empCheck() {
        double empCheck = Math.floor(Math.random() * 10) % 3;
        return empCheck;
    }

    /**
     * Usecase4 Calculating All Employee Wage Using Switch case statement
     */
    @Override
    public void calculateUsingSwitchCase() {
        int emphr;
        float salary = 0;
        switch ((int) empCheck()) {
            case 1:
                System.out.println("Employee is Part Time");
                emphr = 4;
                break;
            case 2:
                System.out.println("Employee is Full Time");
                emphr = 8;
                break;
            default:
                System.out.println("Employee is Abscent");
                emphr = 0;
                break;
        }
        salary = (employeeWage.getEmpRatePerHour() * emphr);
        System.out.println(employeeWage.getCompany() + " Employee Salary is : " + salary);
    }
}
