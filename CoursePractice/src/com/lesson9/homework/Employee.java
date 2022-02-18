package com.lesson9.homework;

class Employee {
    private String name;
    private int yearOfJoining;
    private double salary;
    private String address;

    Employee(String name, int yearOfJoining, String address, double salary) {
        this.address = address;
        this.yearOfJoining = yearOfJoining;
        this.name = name;
        this.salary = salary;

    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    void setName(String name) {
        this.name = name;
    }

    void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public String getAddress() {
        return address;
    }

    public double getSalary() {
        return salary;
    }


    public static void printTableObjects(Employee[] employees) {
        System.out.println("-------------------------------------------------------------------------");
        System.out.printf("%10s %20s %25s %15s", "Name", "Address", "Year of joining", "Salary");
        System.out.println("\n-------------------------------------------------------------------------");
        for (Employee value : employees) {
            System.out.format("%10s %20s %25d %15s", value.name, value.address, value.yearOfJoining, value.salary);
            System.out.println("\n-------------------------------------------------------------------------");
        }
    }
}
