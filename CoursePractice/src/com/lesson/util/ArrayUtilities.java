package com.lesson.util;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ArrayUtilities {

    /**
     * The method reads and print all the elements of an integer type array with one dimension.
     * @param yourArr - one dimension integer array
     */
    public static void printOneDimensionArray(int[] yourArr) {

        System.out.println("\n===========================");
        System.out.println("This is your array printed!");
        for (int i = 0; i < yourArr.length; i++) {
            int element = i;
            System.out.print("\nThe element [" + ++element + "] from your array is: " + yourArr[i]);
        }
        System.out.println();
    }

    /**
     * The method reads and print all the elements of a string type array with one dimension.
     * @param yourArr - one dimension String type array
     */
    public static void printOneDimensionStringArray(String[] yourArr) {

        System.out.println("\n===========================");
        System.out.println("This is your array printed!");
        for (int i = 0; i < yourArr.length; i++) {
            int element = i;
            System.out.print("\nThe element [" + ++element + "] from your array is: " + yourArr[i]);
        }
        System.out.println();
    }

    /**
     * The method reads and print all the elements of a string type array with two dimensions.
     * @param yourArr -  - two dimensions integer array
     * @param arrRow - number of rows
     * @param arrColumn - number of columns
     */
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

    /**
     * The checkInput method reads a value and verifies if its an integer or not, it calls the readIntValue method that
     * uses hasNextInt() utility to validate the input, otherwise it throws an exception which leads to prompting user
     * to enter the value again.
     * @param readValue - scanner oject
     * @return input - a valid integer
     */
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

    /**
     * This method is a part of a validation process of an integer value that uses hasNextInt() method.
     * @param readValue - scanner object
     * @return readValue.nextInt() or checkInput(readValue)
     */
    public static int readIntValue(Scanner readValue) {
        if (readValue.hasNextInt()) {
            return readValue.nextInt();
        } else {
            System.out.print("\nInvalid input, it can only be integer. Introduce again:");
            readValue.next();
            return checkInput(readValue);
        }
    }

    /**
     * Reads a one dimension integer array and calculates the sum of its elements.
     * @param oneDimArr - one dimension integer array
     * @return sum
     */
    public static long getSumOfElementsArr(int[] oneDimArr) {
        long sum = 0;
        for (int value : oneDimArr) {
            sum += value;
        }
        return sum;
    }

    /**
     * Calculates the average value of a one dimension integer array elements.
     * @param oneDimArr - one dimension integer array
     * @return sumOfElementsArr
     */
    public static double getAverageValueArr(int[] oneDimArr) {
        return (double) getSumOfElementsArr(oneDimArr) / oneDimArr.length;
    }

    /**
     * Reads a one dimension integer array and calculates the number of even integers in the array.
     * @param oneDimArr - one dimension integer array
     * @return even - number of even elements.
     */
    public static int getNumberOfEvenArr(int[] oneDimArr) {
        int even = 0;
        for (int value : oneDimArr) {
            if (value % 2 == 0) {
                even++;
            }
        }
        return even;
    }

    /**
     * Reads a one dimension integer array and calculates the number of odd integers in the array.
     * @param oneDimArr - one dimension integer array
     * @return odd - number of odd elements.
     */
    public static int getNumberOfOddArr(int[] oneDimArr) {
        int odd = 0;
        for (int value : oneDimArr) {
            if (value % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    /**
     * The method uses Math.random() to randomly give a number between minim value and maxim value and returns it.
     * @param min - minimum value
     * @param max - maximum value
     * @return an integer number
     */
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    /**
     * Reads a one dimension integer array and returns the maximum value.
     * @param oneDimArr - one dimension integer array
     * @return max - maximum value of all elements
     */
    public static long getMaximumValueOfArr(int[] oneDimArr) {
        int max = oneDimArr[0];
        for (int value : oneDimArr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /**
     * Reads a one dimension integer array and returns the minimum value.
     * @param oneDimArr - one dimension integer array
     * @return min - minimum value of all elements
     */
    public static long getMinimValueOfArr(int[] oneDimArr) {
        int min = oneDimArr[0];
        for (int value : oneDimArr) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**
     * Generating a one dimension String type array with the help of a random value utility getRandomNumber()
     * @param n - length of the array
     * @return myStringArr - the String type array
     */
    public static String[] arrInitString(int n) {
        String[] myStringArr;
        myStringArr = new String[n];
        for (int i = 0; i < myStringArr.length; i++) {
            myStringArr[i] = String.valueOf(ArrayUtilities.getRandomNumber(800, 1));
        }
        return myStringArr;
    }

    /**
     * The method copies a String type array elements into another String type array.
     * @param fromStrArr - String type array to copy
     * @param toStrArr - the copied String type array
     */
    public static void copyStringArr ( String[] fromStrArr, String[] toStrArr){
        for (int i=0; i<fromStrArr.length;i++){
             toStrArr[i] = fromStrArr[i];
        }
    }
    public static String getRandomString(){
        // create a string of all characters
        String alphabet = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQRrSdTtUuVvWwXxYyZz";

        // create random string builder
        StringBuilder sb = new StringBuilder();

        // create an object of Random class
        Random random = new Random();

        // specify length of random string
        int length = 7;

        for(int i = 0; i < length; i++) {

            // generate random index number
            int index = random.nextInt(alphabet.length());

            // get character specified by index
            // from the string
            char randomChar = alphabet.charAt(index);

            // append the character to string builder
            sb.append(randomChar);
        }

        return sb.toString();
    }
    public static double getRandomDoubleNumber(double min, double max) {
        return ((Math.random() * (max - min)) + min);
    }

}
