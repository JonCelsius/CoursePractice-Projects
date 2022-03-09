package com.lesson18.homework;

import java.util.ArrayList;

public class CompanyEmployeesProcess {

    public void printCompanyEmployees(ArrayList<CompanyEmployee> companyEmployees) {
        for (CompanyEmployee obj : companyEmployees) {
            System.out.println(obj);
        }
    }

    public void sortByYearOfActivity(ArrayList<CompanyEmployee> companyEmployees) {
        for (CompanyEmployee obj : companyEmployees) {
            if (obj.getYearsOfActivity() >= 5) {
                System.out.println(obj);
            }

        }
    }

}
