package com.lesson10.homework;

import java.util.Scanner;

public class Problem2 {

    static Scanner scanner = new Scanner(System.in);

    public static void checkForWeekDayOrHoliday() {
        System.out.print("Enter the day of the week in upper CASE:   ");
        String introducedDay = scanner.nextLine();
        WeekDay validateDay = WeekDay.valueOf(introducedDay);
        if (validateDay.isWeekDay())
            System.out.println("The day you entered is a Week Day!!");
        else System.out.println("The day you entered is NOT a Week Day!!");
        if (validateDay.isHoliday())
            System.out.println("The day you entered is a Holiday!!");
        else System.out.println("The day you entered is NOT a Holiday!!");
        System.out.println("This is the Weekday Enum!");
        WeekDay[] arrWeekday = WeekDay.values();
        EnumUtil.enumArrPrintWeekday(arrWeekday);

    }
}
