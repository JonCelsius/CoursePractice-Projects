package com.lesson8.homework;


import com.lesson.util.ArrayUtilities;

import java.util.Scanner;

public class IntArrayExample {
    private static final Scanner readValue = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArr;
        int n;

        System.out.print("Enter the length of your array: ");
        n = ArrayUtilities.checkInput(readValue);
        myArr = new int[n];
        for (int i = 0; i < myArr.length; i++) {
            int element = i;
            System.out.print("\nEnter the [" + ++element + "] element: ");
            myArr[i] = ArrayUtilities.checkInput(readValue);
        }

        ArrayUtilities.printOneDimensionArray(myArr);
readValue.close();
    }


}
