package com.lesson11.homework;

public class SavingsAccount {
    private static float annualInterestRate;
    private double savingsBalance;

    public void setSavingsBalance(double newBalance) {
        this.savingsBalance = newBalance;

    }

    public double calculateMonthlyInterest() {
        return savingsBalance + (savingsBalance * annualInterestRate / 100) / 12;
    }

    public static void modifyAnnualInterestRate(float rate) {
        annualInterestRate = rate;
    }
}
