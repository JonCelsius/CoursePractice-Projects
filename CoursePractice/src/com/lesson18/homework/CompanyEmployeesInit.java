package com.lesson18.homework;


import com.lesson.util.ArrayUtilities;
import com.lesson17.homework.ValidationInput;

import java.util.ArrayList;

public class CompanyEmployeesInit {

    public static ArrayList<CompanyEmployee> companyEmployeesInit() {
        ArrayList<CompanyEmployee> companyEmployees = new ArrayList<>();
        String name;
        String address;
        int yearOfJoining;
        double salary;
        int numberOfEmployees;
        ValidationInput validationInput = new ValidationInput();
        System.out.print("Enter the number of employees: ");
        numberOfEmployees = validationInput.checkIntInput();

        for (int i = 0; i < numberOfEmployees; i++) {
            //System.out.print("\nEnter the name: ");
           // name = (validationInput.inputString());
           // System.out.print("\nEnter the address: ");
            //address = (validationInput.inputString());
            name = ArrayUtilities.getRandomString();
            address = ArrayUtilities.getRandomString();
            yearOfJoining = (ArrayUtilities.getRandomNumber(2015, 2022));
            salary = (ArrayUtilities.getRandomNumber(15_000, 10_0000));
            companyEmployees.add(i, new CompanyEmployee(name, yearOfJoining, salary, address));
        }
        return companyEmployees;

    }
}
