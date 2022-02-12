package com.lesson7.homework;


import java.util.Scanner;

public class DisplayNumber {
    private static long minimValue;
    private static Scanner readValue;
    private static long maximValue;


    public static void main(String[] args) {
        int ctr = 0;
        readValue = new Scanner(System.in);
        System.out.print("Input the minimum value to start: ");
        minimValue = readValue.nextLong();
        inputMaximumAndValidNumber();

        for (long i = minimValue; i < maximValue; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                ctr++;
                if (ctr == 10) {
                    System.out.println();
                    ctr = 0;
                }
            }
        }

        readValue.close();
    }

    public static void inputMaximumAndValidNumber() {
        System.out.print("\nInput the maximum value to end: ");
        maximValue = readValue.nextLong();
        while (maximValue < minimValue) {
            System.out.print("\nYou entered the wrong maximum value, it has to be greater than minimum value! Please enter again: ");
            maximValue = readValue.nextLong();

        }
    }

}


