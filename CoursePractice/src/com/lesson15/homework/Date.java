package com.lesson15.homework;

public class Date {
    private int day;
    private int year;
    private int month;

    public void setDay(int date) {
        if (date > 0 && date <= 31) {
            this.day = date;
        } else {
            this.day = 0;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMonth(int month) {
        if (month > 0 && month <= 12) {
            this.month = day;
        } else {
            this.month = 0;
        }
    }

    public void displayDate() {
        System.out.println(" This is the date:");
        System.out.println(" " + day + "/" + month + "/" + year + "");
    }
}
