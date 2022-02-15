package com.lesson9.homework;

import com.lesson.util.ArrayUtilities;
import com.lesson.util.ValidationClass;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void printEmployeeList() {
        String name, address;
        int yearOfJoining;
        double salary;
        int numberOfEmployees;
        Scanner scanValue = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        numberOfEmployees = scanValue.nextInt();
        scanValue.nextLine();
        Employee[] employee = new Employee[numberOfEmployees];

        for (int i = 0; i < employee.length; i++) {

            System.out.print("\nEnter the name: ");
            name = scanValue.nextLine();
           /* while (!ValidationClass.isValidNameString(name)){
                System.out.println("Enter again!");
                name = scanValue.nextLine();
            }*/
            System.out.print("\nEnter the address: ");
            address = scanValue.nextLine();
            /*while (!ValidationClass.isValidAddressString(address)){
                System.out.println("Enter again!");
                address = scanValue.nextLine();
            }*/
            //System.out.print("Enter the year of the employee joining: ");
            yearOfJoining = ArrayUtilities.getRandomNumber(1990,2022);
            //System.out.print("Enter the salary of the employee: ");
            salary = ArrayUtilities.getRandomNumber(15_000,10_0000);
            employee[i] = new Employee(name, yearOfJoining, address, salary);
        }

       Employee.printTableObjects(employee);



    }
}
