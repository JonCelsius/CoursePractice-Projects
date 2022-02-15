package com.lesson5.homework;

import java.util.Scanner;

public class EvenOddCheck {
    public static void main(String[] args) {
        long numberToCheck;
        Scanner readNumber = new Scanner(System.in);
        System.out.print("Introduceti numarul!");
        numberToCheck = readNumber.nextLong();
        if (numberToCheck % 2 == 0) {
            System.out.println("Numarul inntrodus este par!");
        } else {
            System.out.println("Numarul inntrodus este impar!");
        }
        readNumber.close();
    }
}