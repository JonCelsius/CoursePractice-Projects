package lesson8.homework;

import java.util.Scanner;

public class CopyArray {
    public static void main(String[] args) {
        String[] firstArrString;
        String[] secondArrString;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of your ARRAY: ");
        int n = ArrayUtilities.checkInput(sc);
        firstArrString = ArrayUtilities.arrInitString(n);
        secondArrString = new String[firstArrString.length];
        ArrayUtilities.printOneDimensionStringArray(firstArrString);
        ArrayUtilities.copyStringArr(firstArrString, secondArrString);
        System.out.println("========================================================= ");
        System.out.println("\n\nThis is the second array copied from your first array!");
        ArrayUtilities.printOneDimensionStringArray(secondArrString);
        sc.close();
    }
}
