package com.lesson9.homework;

import java.util.Scanner;

class Problem4 {
    static Scanner readPin;

    public static void pinLogInTimeOut() {
        String yourPin;
        readPin = new Scanner(System.in);
        System.out.println("Enter the PIN! ");
        yourPin = readPin.nextLine();
        authFail3times(yourPin);


    }

    private static void authFail3times(String yourPin) {
        int authFail = 0;
        while (authFail <= 2) {

            if (PinLogIn.pinCheck(yourPin)) {
                System.out.println("CORRECT! Welcome back! ");
                break;
            } else {
                if (authFail == 2) {
                    System.out.println("Sorry but you have been locked out! ");
                    break;
                }
                System.out.println("Incorrect, try again! ");
                yourPin = readPin.nextLine();
                authFail++;
            }
        }
    }
}