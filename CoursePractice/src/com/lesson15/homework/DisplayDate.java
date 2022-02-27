package com.lesson15.homework;

import java.util.Scanner;

public class DisplayDate {
    public static void main(String[] args) {
        Date date= new Date();
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the  day: ");
        date.setDay(scanner.nextInt());
        System.out.print("\nEnter the month: ");
        date.setMonth(scanner.nextInt());
        System.out.print("\nEnter the year: ");
        date.setYear(scanner.nextInt());
        date.displayDate();
        scanner.close();

    }
}
