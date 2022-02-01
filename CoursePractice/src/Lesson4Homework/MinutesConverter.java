package Lesson4Homework;

import java.util.Scanner;

public class MinutesConverter {
    public static void main(String... args) {
        long minutes;
        double days, years;
        int i = 1, cycleNumber;
        Scanner minObject = new Scanner(System.in);
        System.out.println("Introduceti numarul de cicluri de calculare: ");
        cycleNumber = minObject.nextInt();
        while (i <= cycleNumber) {
            System.out.println("Introduceti numarul de minute: ");
            minutes = minObject.nextLong();
            days=(float)minutes/1440;
            years=(float)minutes/(365*1440);
            System.out.println("Numarul de zile este egal cu " + String.format("%.2f",days) + "\nIar numarul de ani este egal cu "+
                    String.format("%.8f",years));
            i++;
        }


    }
}