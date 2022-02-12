package lesson8.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayUtilities {


    public static void printOneDimensionArray(int[] yourArr) {

        System.out.println("\n===========================");
        System.out.println("This is your array printed!");
        for (int i = 0; i < yourArr.length; i++) {
            int element = i;
            System.out.print("\nThe element [" + ++element + "] from your array is: " + yourArr[i]);
        }
        System.out.println();
    }

    public static void printOneDimensionStringArray(String[] yourArr) {

        System.out.println("\n===========================");
        System.out.println("This is your array printed!");
        for (int i = 0; i < yourArr.length; i++) {
            int element = i;
            System.out.print("\nThe element [" + ++element + "] from your array is: " + yourArr[i]);
        }
        System.out.println();
    }

    public static void printTwoDimensionArray(int[][] yourArr, int arrRow, int arrColumn) {

        System.out.println("\n===========================");
        System.out.println("This is your two dimension array printed!");
        for (int i = 0; i < arrRow; i++) {
            int row = i + 1;
            System.out.println();
            for (int j = 0; j < arrColumn; j++) {
                int column = j + 1;
                System.out.print(" [" + row + "]" + "[" + column + "]-->" + yourArr[i][j] + "   ");
            }
        }

    }

    public static int checkInput(Scanner readValue) {
        int input = 0;
        try {
            input = readIntValue(readValue);
            while (input <= 0) {
                System.out.print("\nEntered number is not valid, please enter an integer positive number!:  ");
                input = readIntValue(readValue);
            }
            return input;

        } catch (InputMismatchException inputMismatchException) {
            System.out.print("\nEntered number is not valid, please enter an integer positive number!:");
            readValue.next();
            return checkInput(readValue);
        }

    }

    public static int readIntValue(Scanner readValue) {
        if (readValue.hasNextInt()) {
            return readValue.nextInt();
        } else {
            System.out.print("\nInvalid input, it can only be integer. Introduce again:");
            readValue.next();
            return checkInput(readValue);
        }
    }

    public static long sumOfElementsArr(int[] oneDimArr) {
        long sum = 0;
        for (int value : oneDimArr) {
            sum += value;
        }
        return sum;
    }

    public static double averageValueArr(int[] oneDimArr) {
        return (double) sumOfElementsArr(oneDimArr) / oneDimArr.length;
    }

    public static int numberOfEvenArr(int[] oneDimArr) {
        int even = 0;
        for (int value : oneDimArr) {
            if (value % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    public static int numberOfOddArr(int[] oneDimArr) {
        int odd = 0;
        for (int value : oneDimArr) {
            if (value % 2 != 0) {
                odd++;
            }
        }
        return odd;


    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static long maximumValueOfArr(int[] oneDimArr) {
        int max = oneDimArr[0];
        for (int value : oneDimArr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static long minimValueOfArr(int[] oneDimArr) {
        int min = oneDimArr[0];
        for (int value : oneDimArr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static String[] arrInitString(int n) {
        String[] myStringArr;
        myStringArr = new String[n];
        for (int i = 0; i < myStringArr.length; i++) {
            myStringArr[i] = String.valueOf(ArrayUtilities.getRandomNumber(800, 1));
        }
        return myStringArr;
    }
    public static void copyStringArr ( String[] fromStrArr, String[] toStrArr){
        for (int i=0; i<fromStrArr.length;i++){
             toStrArr[i] = fromStrArr[i];
        }
    }
}
