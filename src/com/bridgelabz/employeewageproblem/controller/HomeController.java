package com.bridgelabz.employeewageproblem.controller;

import com.bridgelabz.employeewageproblem.service.Service;
import com.bridgelabz.employeewageproblem.serviceimplementation.ServiceImp;

import java.util.Scanner;

public class HomeController {

    public static void main(String[] args) {
        System.out.println(" Welcome to Employee Wage Computation Program. ");
        Service service = new ServiceImp();
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. To Check Use Case1 Enter 1: ");
        int ch=scanner.nextInt();
        switch (ch){
            case 1:service.checkEmployee();
                   break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

}
