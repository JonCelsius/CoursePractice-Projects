package com.lesson7.homework;

import java.util.Scanner;

public class LoopOfSum {
    private static Scanner readValue;

    public static void main(String... args) {
        readValue = new Scanner(System.in);
        double firsNumber, secondNumber, sum;
        do {
            firsNumber = initializeTheValue();
            secondNumber = initializeTheValue();
            sum = sumOfTwoNumbers(firsNumber, secondNumber);
            System.out.print("The sum of numbers you just entered is: " + firsNumber + " + " + secondNumber + " = " + sum);

        } while (askToLoopAgain());
        readValue.close();
    }

    /**
     * Calculates the sum of two double numbers
     * @param num1
     * @param num2
     * @return num1+num2
     */
    public static double sumOfTwoNumbers(double num1, double num2) {
        return (num1 + num2);
    }

    /**
     * Prompts the user to enter a value
     * @return user's input
     */
    public static double initializeTheValue() {
        System.out.print("\nEnter the value: ");
        return (readValue.nextDouble());
    }

    /**
     * The Method askToLoopAgain is created to prompt the user to enter the value of Yes or No
     * in order to rerun the program, to rerun the entered character must be "Y" and for
     * stopping the program the value should be "N".
     * @return boolean
     */
    public static boolean askToLoopAgain() {
        System.out.print("\nDo you want to repeat the program?  Y/N : ");
        String input = readValue.next();
        boolean check = false;
        while (!(input.equals("N") || input.equals("Y"))) {
            System.out.print("\nYou did not enter the valid value, please enter Y/N : ");
            input = readValue.next();
        }
        if (input.equals("Y")) {
            check = true;
        }
        return check;
    }
}
