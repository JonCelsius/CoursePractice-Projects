package com.lesson12.homework;

import java.util.Scanner;

public class MainHomework {
    public static void main(String[] args) {
        Scanner switchKey = new Scanner(System.in);
        while (true) {
            int k;
            System.out.println("\n\n-----------------------------------------------------------------------------------------------");
            System.out.println("This is the MAIN menu of Lesson 10 Homework. " +
                    "\nPlease enter the corresponding number of the problem you want to run!");
            System.out.println(" 1. Run the program that calculates the charge amount to pe paid by customers who parked their car in a parking spot.");
            System.out.println(" 2. Run the program that determines whether a number is prime or not, and show all prime number up to 10 000.");
            System.out.println(" 3. Exit the MAIN menu!");
            System.out.println("-----------------------------------------------------------------------------------------------");
            k = switchKey.nextInt();
            switch (k) {


                case 1:
                    Problem1.ParkingChargeCalculator();
                    break;
                case 2:
                    Problem2.primeNumberVerifyAndPrint();
                    break;
                case 3:
                    switchKey.close();
                    return;
            }


        }
    }
}