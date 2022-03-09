package com.bridgelabz.employeewageproblem.model;

public class EmployeeWage {

    public  final int IS_FULL_TIME = 2;
    public  final int IS_PART_TIME = 1;
    private Company company;
    private int maxHoursInMonth;
    private int empRatePerHour;
    private int numberOfWorkingDays;

    public EmployeeWage(){

    }

    public EmployeeWage(Company company, int maxHoursInMonth, int empRatePerHour, int numberOfWorkingDays) {
        this.company = company;
        this.maxHoursInMonth = maxHoursInMonth;
        this.empRatePerHour = empRatePerHour;
        this.numberOfWorkingDays = numberOfWorkingDays;
    }


    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public int getMaxHoursInMonth() {
        return maxHoursInMonth;
    }

    public void setMaxHoursInMonth(int maxHoursInMonth) {
        this.maxHoursInMonth = maxHoursInMonth;
    }

    public int getEmpRatePerHour() {
        return empRatePerHour;
    }

    public void setEmpRatePerHour(int empRatePerHour) {
        this.empRatePerHour = empRatePerHour;
    }

    public int getNumberOfWorkingDays() {
        return numberOfWorkingDays;
    }

    public void setNumberOfWorkingDays(int numberOfWorkingDays) {
        this.numberOfWorkingDays = numberOfWorkingDays;
    }

    @Override
    public String toString() {
        return "EmployeeWage{" +
                "company=" + company +
                ", maxHoursInMonth=" + maxHoursInMonth +
                ", empRatePerHour=" + empRatePerHour +
                ", numberOfWorkingDays=" + numberOfWorkingDays +
                '}';
    }
}
