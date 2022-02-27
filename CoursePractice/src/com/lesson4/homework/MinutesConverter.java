package com.lesson4.homework;

import java.util.Scanner;

public class MinutesConverter {
    public static void main(String... args) {
        long minutes;
        double days, years;
        int i = 1, cycleNumber;
        Scanner minObject = new Scanner(System.in);
        System.out.println("Introduceti numarul de cicluri de calculare: ");
        cycleNumber = minObject.nextInt();
        //Loops the amount of times set in cycleNumber to enter the minutes and run the calculation
        while (i <= cycleNumber) {
            System.out.println("Introduceti numarul de minute: ");
            minutes = minObject.nextLong();
            //Calculates the amount of days
            days = (float) minutes / 1440;
            //Calculates the amount of years
            years = (float) minutes / (365 * 1440);
            System.out.println("Numarul de zile este egal cu " + String.format("%.2f", days) + "\nIar numarul de ani este egal cu " +
                    String.format("%.8f", years));
            i++;
        }
        minObject.close();

    }
}