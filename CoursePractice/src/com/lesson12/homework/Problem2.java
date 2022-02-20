package com.lesson12.homework;

import com.lesson.util.ArrayUtilities;


import java.util.Scanner;

public class Problem2 {
    public static void primeNumberVerifyAndPrint (){
        Scanner readNumber = new Scanner(System.in);
        int numberToVerify;
        int maxNumberToCheck;
        System.out.print("Enter the number you want to verify: ");
        numberToVerify=ArrayUtilities.checkInput(readNumber);
        if (PrimeNumberCheck.checkIfPrime(numberToVerify)){
            System.out.println("Your number " + numberToVerify + " is Prime!");
        }else {
            System.out.println("Your number " + numberToVerify + " is NOT Prime!");
        }
        System.out.print("Enter the maximum number you want to verify up: ");
        maxNumberToCheck= ArrayUtilities.checkInput(readNumber);
        System.out.println("The amount of prime number in a range of 2 to " +
                maxNumberToCheck + " is : " + PrimeNumberCheck.showNumOfPrimes(maxNumberToCheck));
    }

}
