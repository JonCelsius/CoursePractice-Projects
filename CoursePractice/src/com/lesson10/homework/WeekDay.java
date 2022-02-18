package com.lesson10.homework;

public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay() {
        return this != SUNDAY && this != SATURDAY;
    }

    public boolean isHoliday() {
        return this == SUNDAY || this == SATURDAY;
    }
}
