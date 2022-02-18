package com.lesson10.homework;

import org.jetbrains.annotations.NotNull;

public class EnumUtil {
    public static void enumArrPrint(MonthsOfTheYear[] monthsList) {
        for (MonthsOfTheYear months : monthsList) {
            System.out.println(months);
        }
    }

    public static void enumArrPrintWeekday(WeekDay[] dayList) {
        for (WeekDay day : dayList) {
            System.out.println(day);
        }
    }
}
