package Lesson4Homework;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
        int k;
        double price = 0, tax = 0, total = 0;
        int quantity = 0;
        Scanner myObject = new Scanner(System.in);
        System.out.println("Daca doresti sa introduci manual valorile introdu 1 !\nDaca doresti sa fie utilizate valorile implicite introdu 2 !");
        k = myObject.nextInt();
        while (k != 1 && k != 2) {
            System.out.println("Ai introdus gresit valoare! Mai incearca! \n\n\n" +
                    "Daca doresti sa introduci manual valorile introdu 1 !\n Daca doresti sa fie utilizate valorile implicite introdu 2 !");
            k = myObject.nextInt();
        }
        switch (k) {
            case 1:
                System.out.println("Introduceti pretul: ");
                price = myObject.nextDouble();
                System.out.println("Introduceti taxa: ");
                tax = myObject.nextDouble();
                System.out.println("Introduceti cantitatea: ");
                quantity = myObject.nextInt();
                break;


            case 2:
                price = 125.44;
                tax = 23.2;
                quantity = 56;
                break;
        }

        total = price * quantity * tax;
        System.out.println("Total cost with tax is: " + total);

    }
}
