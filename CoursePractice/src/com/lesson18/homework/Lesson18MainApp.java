package com.lesson18.homework;

import com.lesson17.homework.ValidationInput;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Lesson18MainApp {
    public static void main(String[] args) {
        ValidationInput validationInput = new ValidationInput();
        int k;
        while (true) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Enter the below option");
            System.out.println("1. A method that will return the list of all Employees of a company that have at least 5 years of activity.");
            System.out.println("2. Display the collection of unique values on the screen.");
            System.out.println("3. English-Romanian dictionary for 10 words.");
            System.out.println("4. Exit the program.");
            System.out.println("-------------------------------------------------------------------------------");
            k = validationInput.checkIntInput();
            switch (k) {
                case 1: {
                    ArrayList<CompanyEmployee> employees = CompanyEmployeesInit.companyEmployeesInit();
                    CompanyEmployeesProcess employeesProcess = new CompanyEmployeesProcess();
                    employeesProcess.printCompanyEmployees(employees);
                    System.out.println("The employess that have at least 5 years of activity are:\n");
                    employeesProcess.sortByYearOfActivity(employees);
                }
                break;
                case 2:
                    ArrayList<String> valuesCollection = ValuesCollection.initValueCollection();
                    ValuesCollection.printValuesCollection(valuesCollection);
                    ValuesCollection.displayUniqueValues(valuesCollection);

                    break;
                case 3:
                    Map<String,String> enRoDictionary = EnRoDictionary.enRoDictionaryInit();
                    EnRoDictionary.printEnRoDictionary(enRoDictionary);

                    break;
                case 4:
                    validationInput.closeScanner();
                    return;
                default:
                    System.out.println("?????????????????????????????????????????????");
                    System.out.println("\nSorry, you have entered a invalid option!\n");
                    System.out.println("?????????????????????????????????????????????");
            }


        }
    }
}

