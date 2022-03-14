package com.bridgelabz.employeewageproblem.controller;

import com.bridgelabz.employeewageproblem.model.Company;
import com.bridgelabz.employeewageproblem.model.EmployeeWage;
import com.bridgelabz.employeewageproblem.service.Service;
import com.bridgelabz.employeewageproblem.serviceimplementation.ServiceImp;

import java.util.Scanner;

public class HomeController {

    public static void main(String[] args) {
        float salary;
        System.out.println(" Welcome to Employee Wage Computation Program. ");
        Service service = new ServiceImp();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("       =================   Menu   =================   ");
            System.out.println("   1) Enter to Use Employee Present Or Abscent.");
            System.out.println("   2) Enter to Calculate FullTime Employee Wage.");
            System.out.println("   3) Enter to Calculate All Employee Wage.");
            System.out.println("   4) Enter to Calculate All Employee Wage Using Switch Case.");
            System.out.println("   5) Enter to Calculate Monthly Employee Salary.");
            System.out.println("   6) Enter to Calculate Monthly Employee Salary till Condition not became false.");
            System.out.println("   7) Enter to Exit From Employee Wage.");
            int ch = scanner.nextInt();
            System.out.println();
            switch (ch) {
                case 1:
                    service.checkEmployee();
                    break;
                case 2:
                    salary = service.calculateEmployeeWage();
                    System.out.println("Employee Salary is : " + salary);
                    break;
                case 3:
                    salary = service.calculateAllEmployeeWage();
                    System.out.println("Employee Salary is : " + salary);
                    break;
                case 4:
                    service.calculateUsingSwitchCase();
                    break;
                case 5:
                    service.calculateEmployeeWageForMonth();
                    break;
                case 6:
                    System.out.println("Enter Company Name : ");
                    String comapnyName = scanner.next();
                    System.out.println("Enter Maximum Hours In Month : ");
                    int maximumHoursInMonth = scanner.nextInt();
                    System.out.println("Enter Employee Rate Per Hour : ");
                    int employeeRatePerHour = scanner.nextInt();
                    System.out.println("Enter Number Of Working Days in Month : ");
                    int numberOfWorkingDaysInMonth = scanner.nextInt();
                    EmployeeWage employeeWage = new EmployeeWage(new Company(comapnyName), maximumHoursInMonth, employeeRatePerHour, numberOfWorkingDaysInMonth);
                    service.calculateEmployeeWageTillCondition(employeeWage);
                    break;
                case 7:
                    System.out.println("you exit from Employee Wage Computation.");
                    System.exit(0);
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

}
