package com.lesson17.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidationInput {
    Scanner scanner;

    public ValidationInput() {
        scanner = new Scanner(System.in);
    }
    public String inputString() {
        return scanner.nextLine();
    }
    public void closeScanner() {
        this.scanner.close();
    }

    public int checkIntInput() {
        int input = 0;
        try {
            input = readIntValue();
            while (input <= 0) {
                System.out.print("\nEntered number is not valid, please enter an integer positive number!:  ");
                input = readIntValue();
            }
            scanner.nextLine();
            return input;

        } catch (InputMismatchException inputMismatchException) {
            System.out.print("\nEntered number is not valid, please enter an integer positive number!:");
            scanner.next();
            return checkIntInput();
        }

    }

    /**
     * This method is a part of a validation process of an integer value that uses hasNextInt() method.
     * @return readValue.nextInt() or checkInput(readValue)
     */
    public int readIntValue() {
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.print("\nInvalid input, it can only be integer. Introduce again:");
            scanner.next();
            return checkIntInput();
        }
    }
}
