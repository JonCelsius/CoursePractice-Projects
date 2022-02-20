package com.lesson10.homework;


import java.util.Scanner;

class MainHomework {
    public static void main(String[] args) {
        Scanner readValue = new Scanner(System.in);
        while (true) {
            int k;
            System.out.println("-----------------------------------------------------------------------------------------------");
            System.out.println("This is the MAIN menu of Lesson 10 Homework. " +
                    "\nPlease enter the corresponding number of the problem you want to run!");
            System.out.println(" 1. Run the program that reads and prints an Enum class named MonthsOfTheYear.");
            System.out.println(" 2. Run the program that allows you to introduce day of the week and check if it is a Holiday or a WeekDay.");
            System.out.println(" 3. Run the program that shows the wrap objects values created with wrap constructors or with valueOf() method.");
            System.out.println(" 4. Exit the MAIN menu!");
            System.out.println("-----------------------------------------------------------------------------------------------");
            k = readValue.nextInt();
            switch (k) {


                case 1:
                    Problem1.enumParsingPrint(); break;
                case 2:
                    Problem2.checkForWeekDayOrHoliday();break;
                case 3:
                    Problem3.createWrapper();break;
                case 4:
                    readValue.close();
                    return;

            }
        }
    }
}