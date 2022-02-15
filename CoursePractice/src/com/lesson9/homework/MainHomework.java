package com.lesson9.homework;

import com.lesson.util.ValidationClass;

import java.util.Scanner;

public class MainHomework {
    public static void main(String[] args) {
        Scanner readValue = new Scanner(System.in);
        while (true) {
            int k;

            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("This is the MAIN menu of Lesson 9 Homework. " +
                    "\nPlease enter the corresponding number of the problem you want to run!");
            System.out.println(" 1. Run the program that calculates the Rectangle Area.");
            System.out.println(" 2. Run the program that allows you to introduce and print Employees attributes.");
            System.out.println(" 3. Run the program that shows you how many times a character is found in your sentence.");
            System.out.println(" 4. Run the program that lets you guess a PIN code at least 3 times before it locks you up.");
            System.out.println(" 5. Exit the MAIN menu!");
            System.out.println("-----------------------------------------------------------------------------------------------");
            k = readValue.nextInt();

            switch (k) {

                case 1:
                    Problem1.calculateRectangleArea();
                    break;
                case 2:
                    Problem2.printEmployeeList();
                    break;
                case 3:
                    Problem3.countAChar();
                    break;
                case 4:
                    Problem4.pinLogInTimeOut();
                    break;
                case 5:
                    readValue.close();
                    return;
            }
        }
    }
}
