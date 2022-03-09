package com.bridgelabz.employeewageproblem.serviceimplementation;

import com.bridgelabz.employeewageproblem.model.Company;
import com.bridgelabz.employeewageproblem.model.EmployeeWage;
import com.bridgelabz.employeewageproblem.service.Service;

public class ServiceImp implements Service {

    float totalSalary = 0.0f;
    int totalEmpHour = 0;
    int totalWorkingDays = 0;
    Company company = new Company("D-Mart");
    EmployeeWage employeeWage = new EmployeeWage(company, 100, 20, 20);


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
        float salary;
        int employeeHours;
        if (checkEmployee()) {
            employeeHours = 8;
            salary = (employeeWage.getEmpRatePerHour() * employeeHours);
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
        int employeeHours;
        float salary;
        employeeWage.setEmpRatePerHour(20);
        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == employeeWage.IS_FULL_TIME) {
            System.out.println("Employee  is Full Time.");
            employeeHours = 8;

            salary = (employeeWage.getEmpRatePerHour() * employeeHours);
            return salary;
        } else if (empCheck == employeeWage.IS_PART_TIME) {

            System.out.println("Employee is Part Time");
            employeeHours = 4;

            salary = (employeeWage.getEmpRatePerHour() * employeeHours);
            return salary;
        } else {
            System.out.println("Employee is Abscent");
            salary = 0;
            return salary;
        }
    }

    /**
     * @return returing Result Whether It is Full Time Or Part Time Or Abscent
     */
    @Override
    public double empCheck() {
        return Math.floor(Math.random() * 10) % 3;
    }


    /**
     * Usecase4 Calculating All Employee Wage Using Switch case statement
     */
    @Override
    public void calculateUsingSwitchCase() {
        int employeeHours;
        float salary;
        System.out.println("===============" + employeeWage.getCompany() + "======================");
        switch ((int) empCheck()) {
            case 1:
                System.out.println("Employee is Part Time");
                employeeHours = 4;
                break;
            case 2:
                System.out.println("Employee is Full Time");
                employeeHours = 8;
                break;
            default:
                System.out.println("Employee is Abscent");
                employeeHours = 0;
                break;
        }
        salary = (employeeWage.getEmpRatePerHour() * employeeHours);
        System.out.println("Employee Salary is : " + salary);
    }

    /**
     * Usecase5 Calculate Monthly Employee Wage
     */
    @Override
    public void calculateEmployeeWageForMonth() {
        int employeeHours;
        float salary;
        for (int index = 1; index <= employeeWage.getNumberOfWorkingDays(); index++) {

            switch ((int) empCheck()) {
                case 1:
                    employeeHours = 4;
                    break;
                case 2:
                    employeeHours = 8;
                    break;
                default:
                    employeeHours = 0;
                    break;
            }
            salary = (employeeWage.getEmpRatePerHour() * employeeHours);
            totalSalary = (totalSalary + salary);
        }
        System.out.println("===============" + employeeWage.getCompany() + "======================" + "\n" + " Employee Monthly Salary is : " + totalSalary);
    }

    /**
     * UseCase6 Calculate Employee Monthly Wage Till Condition not became false
     */
    @Override
    public void calculateEmployeeWageTillCondition() {
        int employeeHours;
        while (totalEmpHour < employeeWage.getMaxHoursInMonth() && totalWorkingDays < employeeWage.getNumberOfWorkingDays()) {
            totalWorkingDays++;


            switch ((int) empCheck()) {
                case 1:
                    employeeHours = 4;
                    break;
                case 2:
                    employeeHours = 8;
                    break;
                default:
                    employeeHours = 0;
                    break;
            }
            totalEmpHour = (totalEmpHour + employeeHours);
        }

        totalSalary = (totalEmpHour * employeeWage.getEmpRatePerHour());
        System.out.println("===============" + employeeWage.getCompany() + "======================");
        System.out.println("Total Working Hours of the Month: " + totalEmpHour);
        System.out.println("Employee Monthly Salary is : " + totalSalary);

    }
}
