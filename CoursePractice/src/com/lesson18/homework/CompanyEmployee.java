package com.lesson18.homework;

import java.time.LocalDate;

public class CompanyEmployee {
    private String name;
    private int yearOfJoining;
    private int yearsOfActivity;
    private double salary;
    private String address;

    public CompanyEmployee() {
    }

    public CompanyEmployee(String name, int yearOfJoining, double salary, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.address = address;
        this.yearsOfActivity = getCurrentYear() - yearOfJoining;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public int getYearsOfActivity() {
        return yearsOfActivity;
    }

    public void setYearsOfActivity() {
        this.yearsOfActivity = getCurrentYear() - yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCurrentYear() {
        return LocalDate.now().getYear();
    }

    @Override
    public String toString() {
        return "CompanyEmployee{" +
                "name='" + name + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", yearsOfActivity=" + yearsOfActivity +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
