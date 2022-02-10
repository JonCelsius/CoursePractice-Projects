package lesson8.homework;


import java.util.InputMismatchException;
import java.util.Scanner;

public class IntArrayExample {
    private static final Scanner readValue = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArr;
        int n;

        System.out.print("Enter the length of your array: ");
        n = checkInput();
        myArr = new int[n];
        for (int i = 0; i < myArr.length; i++) {
            int element = i;
            System.out.print("\nEnter the [" + ++element + "] element: ");
            myArr[i] = checkInput();
        }

        printOneDimensionArray(myArr);

    }

    public static int checkInput() {
        int input = 0;
        try {
            input = readIntValue();
            while (input <= 0) {
                System.out.print("\nEntered number is not valid, please enter an integer positive number!:  ");
                input = readIntValue();
            }
            return input;

        } catch (InputMismatchException inputMismatchException) {
            System.out.print("\nEntered number is not valid, please enter an integer positive number!:");
            readValue.next();
            return checkInput();
        }

    }

    public static int readIntValue() {
        if (readValue.hasNextInt()) {
            return readValue.nextInt();
        } else {
            System.out.print("\nInvalid input, it can only be integer. Introduce again:");
            readValue.next();
            return checkInput();
        }
    }

    public static void printOneDimensionArray(int[] yourArr) {

        System.out.println("\n===========================");
        System.out.println("This is your array printed!");
        for (int i = 0; i < yourArr.length; i++) {
            int element = i;
            System.out.print("\nThe element [" + ++element + "] from your array is: " + yourArr[i]);
        }
        System.out.println();
    }

}
