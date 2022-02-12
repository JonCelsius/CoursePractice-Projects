package lesson8.homework;

import java.util.Scanner;

public class FindValueArr {
    public static void main(String[] args) {
        String[] yourArray;
        int n;
        String toFind;
        boolean isFind = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of your array: ");
        n = ArrayUtilities.checkInput(sc);
        yourArray = new String[n];
        for (int i = 0; i < yourArray.length; i++) {
            yourArray[i] = String.valueOf(ArrayUtilities.getRandomNumber(100, 1));
        }
        ArrayUtilities.printOneDimensionStringArray(yourArray);
        System.out.print("\n\nEnter the value you want to find: ");
        toFind = sc.next();
        for (String value : yourArray) {
            if (toFind.equals(value)) {
                System.out.println("Your value " + toFind + " is found!");
                isFind = false;
                break;
            }
        }
        if (isFind)
            System.out.println("Your value " + toFind + " is NOT found!");

        sc.close();

    }

}


