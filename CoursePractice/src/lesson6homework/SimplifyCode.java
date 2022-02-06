package lesson6homework;

import java.util.Scanner;

public class SimplifyCode {
    public static void main(String[] args) {
        float temperature, maxTemp, minTemp;
        Scanner readNumber = new Scanner(System.in);
        System.out.print("Introduceti temperatura maxima!");
        maxTemp = readNumber.nextLong();
        System.out.print("Introduceti temperatura minima!");
        minTemp = readNumber.nextLong();
        System.out.print("Introduceti temperatura: ");
        temperature = readNumber.nextLong();

        if (temperature >= minTemp && temperature <= maxTemp) {
            System.out.println("Porridge is just right.");
        } else {
            if (temperature < minTemp) {
                System.out.println("Porridge is too cold.");
            } else {
                System.out.println("Porridge is too hot.");
            }

        }

        readNumber.close();
    }
}
