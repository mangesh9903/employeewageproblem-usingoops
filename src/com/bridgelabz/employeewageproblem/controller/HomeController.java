package com.bridgelabz.employeewageproblem.controller;

import com.bridgelabz.employeewageproblem.service.Service;
import com.bridgelabz.employeewageproblem.serviceimplementation.ServiceImp;

import java.util.Scanner;

public class HomeController {

    public static void main(String[] args) {
        System.out.println(" Welcome to Employee Wage Computation Program. ");
        Service service = new ServiceImp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enter 1 to Check Use Case1 : ");
        System.out.println("2. Enter 2 To Calculate FullTime Employee Wage : ");
        int ch = scanner.nextInt();
        System.out.println();
        switch (ch) {
            case 1:
                service.checkEmployee();
                break;
            case 2:
                float salary = service.calculateEmployeeWage();
                System.out.println("Employee Salary is : " + salary);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}
