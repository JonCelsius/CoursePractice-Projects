package com.lesson8.homework;

import com.lesson.util.ArrayUtilities;

import java.util.Scanner;

public class FindMinMaxValuesOfArray {
    public static void main(String[] args) {
        int[] anArray;
        int n;
        Scanner readValue = new Scanner(System.in);
        System.out.print("Enter the length of your array: ");
        n = ArrayUtilities.checkInput(readValue);
        anArray = new int[n];
        for (int i = 0; i < anArray.length; i++) {
            anArray[i] = ArrayUtilities.getRandomNumber(100, 1);
        }
        ArrayUtilities.printOneDimensionArray(anArray);
        System.out.print("\nThe maximum value is: " + ArrayUtilities.maximumValueOfArr(anArray));
        System.out.print("\nThe minimum value is: " + ArrayUtilities.minimValueOfArr(anArray));
        readValue.close();
    }
}
