package com.bridgelabz.employeewageproblem.controller;

import com.bridgelabz.employeewageproblem.service.Service;
import com.bridgelabz.employeewageproblem.serviceimplementation.ServiceImp;

import java.util.Scanner;

public class HomeController {

    public static void main(String[] args) {
        float salary;
        System.out.println(" Welcome to Employee Wage Computation Program. ");
        Service service = new ServiceImp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enter 1 to Check Use Case1 : ");
        System.out.println("2. Enter 2 to Calculate FullTime Employee Wage : ");
        System.out.println("3. Enter 3 to Calculate All Employee Wage : ");
        System.out.println("4. Enter 4 to Calculate All Employee Wage Using Switch Case: ");
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
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}
