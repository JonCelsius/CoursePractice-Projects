package Lesson5Homework;

import java.util.Scanner;


public class RectangleAreaCompare {

    public static void main(String[] args) {
        double rectangleArea1, rectangleArea2, lengthRectangle1, widthRectangle1, lengthRectangle2, widthRectangle2;
        Scanner readValue = new Scanner(System.in);
        System.out.print("Introduceti lungimea dreptunghiului 1: ");
        lengthRectangle1 = checkInput(readValue.nextDouble(), readValue);
        System.out.print("Introduceti latimea dreptunghiului 1: ");
        widthRectangle1 = checkInput(readValue.nextDouble(), readValue);
        System.out.print("\nIntroduceti lungimea dreptunghiului 2: ");
        lengthRectangle2 = checkInput(readValue.nextDouble(), readValue);
        System.out.print("Introduceti latimea dreptunghiului 2: ");
        widthRectangle2 = checkInput(readValue.nextDouble(), readValue);
        rectangleArea1 = lengthRectangle1 * widthRectangle1;
        rectangleArea2 = lengthRectangle2 * widthRectangle2;
        System.out.println("\n\nMarimile dreptunghiului 1: Lungimea: " + lengthRectangle1 + "   Latimea: " + widthRectangle1);
        System.out.println("Marimile dreptunghiului 2: Lungimea: " + lengthRectangle2 + "   Latimea: " + widthRectangle2);
        if (rectangleArea1 > rectangleArea2) {
            System.out.println("Aria dreptunghiului 1 este mai mare ca aria dreptunghiului 2!   " + rectangleArea1 + " > " + rectangleArea2);
        } else {
            if (rectangleArea1 < rectangleArea2) {
                System.out.println("Aria dreptunghiului 1 este mai mic ca aria dreptunghiului 2!   " + rectangleArea1 + " < " + rectangleArea2);
            } else {
                System.out.println("Ariile dreptunghiurilor sunt egale!   " + rectangleArea1 + " = " + rectangleArea2);
            }

        }
        readValue.close();
    }

    public static double checkInput(double input, Scanner newValue) {

        while (input <= 0) {
            System.out.print("\nNumarul introdus nu este valid, introduceti inca o data: ");
            input = newValue.nextDouble();
        }
        return input;
    }
}