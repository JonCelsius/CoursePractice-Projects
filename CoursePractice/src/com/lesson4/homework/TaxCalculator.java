package com.lesson4.homework;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        int k;
        double price = 0, tax = 0, total = 0;
        int quantity = 0;
        Scanner myObject = new Scanner(System.in);
        System.out.println("Daca doresti sa introduci manual valorile introdu 1 !\nDaca doresti sa fie utilizate valorile implicite introdu 2 !");
        k = myObject.nextInt();
        //This loops the scanner method when the user inputs a wrong value other than 1 or 2
        while (k != 1 && k != 2) {
            System.out.println("Ai introdus gresit valoare! Mai incearca! \n\n\n" +
                    "Daca doresti sa introduci manual valorile introdu 1 !\n Daca doresti sa fie utilizate valorile implicite introdu 2 !");
            k = myObject.nextInt();

        }
        //Switch used for executing the problem with the possibility of introducing the values manually by the user
        // or using the default values
        switch (k) {
            case 1:
                System.out.println("Introduceti pretul: ");
                price = myObject.nextDouble();
                System.out.println("Introduceti taxa: ");
                tax = myObject.nextDouble();
                System.out.println("Introduceti cantitatea: ");
                quantity = myObject.nextInt();
                myObject.close();
                break;


            case 2:
                price = 125.44;
                tax = 23.2;
                quantity = 56;
                break;
        }

        //Total price calculated for both cases
        total = price * quantity * tax;
        System.out.println("Total cost with tax is: " + total);

    }
}
