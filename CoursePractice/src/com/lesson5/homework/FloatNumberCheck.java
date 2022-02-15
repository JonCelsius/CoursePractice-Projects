package com.lesson5.homework;

import java.util.Scanner;

public class FloatNumberCheck {
    public static void main(String[] args) {
        double number;
        Scanner readValue = new Scanner(System.in);
        System.out.print("Introduceti numarul: ");
        number = readValue.nextDouble();
        if (number == 0) {
            System.out.println("Numarul este zero!");
        } else if (number > 0) {
            if (number < 1) {
                System.out.println("Numarul este pozitiv si small!");
            } else if (number > 1000000) {
                System.out.println("Numarul este pozitiv si large!");
            } else {
                System.out.println("Numarul este pozitiv!");
            }

        } else {
            if (Math.abs(number) < 1) {
                System.out.println("Numarul este negativ si small!");
            } else if (Math.abs(number) > 1000000) {
                System.out.println("Numarul este negativ si large!");
            } else {
                System.out.println("Numarul este negativ!");
            }


        }

        readValue.close();
    }

}
