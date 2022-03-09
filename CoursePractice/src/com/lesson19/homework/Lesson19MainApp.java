package com.lesson19.homework;

import com.lesson17.homework.ValidationInput;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Lesson19MainApp {
    public static void main(String[] args) {
        LocalDate theDate = LocalDate.now();
        DateFormatPrint dateFormatPrint = new DateFormatPrint();
        ValidationInput validationInput = new ValidationInput();


        System.out.println("Enter the date in format yyyy-MM-dd:");
        dateFormatPrint.setTheDate(LocalDate.parse(validationInput.checkDate()));
        System.out.println("The date in format yyyy-MM-dd:");
        System.out.println(dateFormatPrint.getTheDate());
        System.out.println("Enter the time in format HH:mm:ss :");
        dateFormatPrint.setTheTime(LocalTime.parse(validationInput.checkTime()));
        System.out.println("The date in format HH:mm:ss :");
        System.out.println(dateFormatPrint.getTheTime());
        System.out.println(dateFormatPrint.theDate.atTime(dateFormatPrint.getTheTime()));
        DateTimeFormatter templateDateTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        System.out.println("\n" + dateFormatPrint.getTheDateTime().format(templateDateTime));
        if (dateFormatPrint.isLeapYear()) {
            System.out.println(dateFormatPrint.getTheDate().getYear() + " - It IS a leap year!");
        } else {
            System.out.println(dateFormatPrint.getTheDate().getYear() + " - It IS NOT a leap year!");
        }
        System.out.println(Period.between(theDate, dateFormatPrint.getTheDate()));
    }
}
