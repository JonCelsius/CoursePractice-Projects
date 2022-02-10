package lesson8.homework;


import java.util.Scanner;

public class IntArrayExample {
    private static final Scanner readValue = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArr;
        int n;

        System.out.print("Enter the length of your array: ");
        n = checkInput(readValue.nextInt());
        myArr = new int[n];
        for (int i = 0; i < myArr.length; i++) {
            int element = i;
            System.out.print("\nEnter the [" + ++element + "] element: ");
            myArr[i] = checkInput(readValue.nextInt());
        }

        printOneDimensionArray(myArr);

    }

    public static int checkInput(int input) {

        while (input <= 0) {
            System.out.print("\nEntered number is not valid, please enter an integer positive number!:  ");
            input = readValue.nextInt();
        }
        return input;
    }

    public static void printOneDimensionArray(int[] yourArr) {

        System.out.println("\n===========================");
        System.out.println("This is your array printed!");
        for (int i = 0; i < yourArr.length; i++) {
            int element = i;
            System.out.print("\nThe element [" + ++element + "] from your array is: " + yourArr[i]);
        }
    }

}
