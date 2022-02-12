package com.lesson7.homework;

import java.util.Scanner;

public class ReverseIntPrint {
    private static Scanner readValue;

    public static void main(String... args) {
        int positiveInteger;
        readValue = new Scanner(System.in);
        positiveInteger = initializeAndValidateTheValue();
        printReverseInt(positiveInteger);
        readValue.close();

    }

    public static int initializeAndValidateTheValue() {
        System.out.print("\nEnter the value: ");
        int input = readValue.nextInt();
        while (input <= 0) {
            System.out.print("\nYou entered the wrong value, please enter a positive number! GO: ");
            input = readValue.nextInt();
        }
        return input;
    }

    public static void printReverseInt(int input) {
       System.out.print("The reverse of your number is: ");
        while (input > 0) {
            System.out.print(input % 10);
            input /= 10;
        }
    }
}
