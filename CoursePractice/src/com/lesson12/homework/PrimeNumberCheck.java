package com.lesson12.homework;

public class PrimeNumberCheck {
    public static boolean checkIfPrime(int numberToCheck) {
        boolean isPrime = true;
        for (int i = 2; i <= numberToCheck / 2; i++) {
            if (numberToCheck % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static int showNumOfPrimes(int max) {
        int num = 0;
        for (int i = 2; i <= max; i++) {
            if (checkIfPrime(i)){
                num++;
            }

        }
        return num;
    }
}