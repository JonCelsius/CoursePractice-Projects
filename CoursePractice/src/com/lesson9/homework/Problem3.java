package com.lesson9.homework;

import java.util.Scanner;

public class Problem3 {
    public static void countAChar() {
        String enteredString;
        char characterToFind;
        Scanner scanValue = new Scanner(System.in);
        System.out.print("Enter the string you want:  ");
        enteredString = scanValue.nextLine();
        System.out.print("Enter the character you want to find: ");
        characterToFind = scanValue.next().charAt(0);
        CountSpecificCharInString.countString(enteredString, characterToFind);
        scanValue.nextLine();

    }

}
