package com.lesson9.homework;

import com.lesson.util.ValidationClass;

import java.util.Scanner;

public class Problem1 {
    public static void calculateRectangleArea(){
        double width, length, area;
        RectangleArea myRectangle = new RectangleArea();
        Scanner scanValue = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        width = scanValue.nextDouble();
        while (!ValidationClass.isValidPositiveDouble(width)) {
            System.out.print("The value is not valid. Plea enter a positive number! \n ----->");
            width = scanValue.nextDouble();
        }
        System.out.print("Enter the length of the rectangle: ");
        length = scanValue.nextDouble();
        while (!ValidationClass.isValidPositiveDouble(length)) {
            System.out.print("The value is not valid. Plea enter a positive number! \n ----->");
            length = scanValue.nextDouble();
        }
        myRectangle.setWidth(width);
        myRectangle.setLength(length);
        System.out.println("The rectangle dimensions are the following! \n" + myRectangle.toString());
        area = myRectangle.getArea(width, length);
        System.out.println("The are of the rectangle is :" + String.format(("%.3f"), area));
    }
}
