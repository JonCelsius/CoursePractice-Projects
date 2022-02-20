package com.lesson12.homework;


import java.util.Scanner;

public class Problem1 {
    public static void ParkingChargeCalculator() {

        int numberOfCustomers;
        Scanner scanValue = new Scanner(System.in);
        System.out.print("Enter the number of customers: ");
        numberOfCustomers = scanValue.nextInt();
        scanValue.nextLine();
        ParkingSpot[] customer = new ParkingSpot[numberOfCustomers];

        for (int i = 0; i < customer.length; i++) {
            System.out.print("\nEnter the parking time for customer " + (i + 1) + ": ");
            customer[i] = new ParkingSpot(scanValue.nextDouble());
            System.out.print("\nFor Customer " + (i + 1) + " charge amount to be paid for " + customer[i].parkingTime
                    + " hour parking is : $" + customer[i].calculateParkingCharge());
        }

    }
}
