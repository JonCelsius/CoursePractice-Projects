package com.hello.java.world;

import com.hello.java.world.FirstPackage.PackageOneMethod;
import com.hello.java.world.SecondPackage.AnotherPackageMethod;

import java.util.Scanner;

public class CourseInit {
    public static void main(String[] args){
        // year to be checked
        int year;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter year! ");
            year = scanner.nextInt();
            boolean leap = false;

            // if the year is divided by 4
            if (year % 4 == 0) {

                // if the year is century
                if (year % 100 == 0) {

                    // if year is divided by 400
                    // then it is a leap year
                    if (year % 400 == 0)
                        leap = true;
                }

                // if the year is not century
                else
                    leap = true;
            }

            if (leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");


            if (year % 4 == 0 & year % 100 == 0 &
                    year % 400 == 0) {
                System.out.println("It IS a leap year!");
            } else {
                System.out.println("It IS NOT a leap year!");
            }
        }
    }

}
