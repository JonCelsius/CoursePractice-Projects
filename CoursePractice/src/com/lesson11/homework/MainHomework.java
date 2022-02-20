package com.lesson11.homework;

public class MainHomework {
    public static void main(String[] args) {
        //Creating two objects of SavingsAccount class.
        SavingsAccount savings1 = new SavingsAccount();
        SavingsAccount savings2 = new SavingsAccount();

        //Setting the saving balance for savings1.
        savings1.setSavingsBalance(2000);
        //Setting the saving balance for savings2.
        savings2.setSavingsBalance(3000);

        // Setting the annual interest rate to 4 %
        SavingsAccount.modifyAnnualInterestRate(4.0f);
        // Printing the amount of savings for both accounts.
        System.out.println("For the first saving Account monthly interest with [4 %]  will be " + String.format("%.4f", savings1.calculateMonthlyInterest()));
        System.out.println("For the second saving Account monthly interest with [4 %]  will be " + String.format("%.4f", savings2.calculateMonthlyInterest()));
        // Setting the annual interest rate to 5 %
        SavingsAccount.modifyAnnualInterestRate(5.0f);
        // Printing the amount of savings for both accounts.
        System.out.println("\nFor the first saving Account monthly interest with [5 %]  will be " + String.format("%.4f", savings1.calculateMonthlyInterest()));
        System.out.println("For the second saving Account monthly interest with [5 %]  will be " + String.format("%.4f", savings2.calculateMonthlyInterest()));

    }
}
