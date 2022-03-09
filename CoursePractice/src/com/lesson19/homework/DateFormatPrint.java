package com.lesson19.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateFormatPrint {
    LocalDate theDate;
    LocalTime theTime;
    LocalDateTime theDateTime=LocalDateTime.now();

    public LocalDate getTheDate() {
        return theDate;
    }

    public void setTheDate(LocalDate theDate) {
        this.theDate = theDate;

    }

    public LocalTime getTheTime() {
        return theTime;
    }

    public void setTheTime(LocalTime theTime) {
        this.theTime = theTime;
    }

    public LocalDateTime getTheDateTime() {
        return theDateTime;
    }

    public void setTheDateTime(LocalDateTime theDateTime) {
        this.theDateTime = theDateTime;
    }

public boolean isLeapYear(){
        boolean leap = false;
    if (this.theDate.getYear() % 4 == 0) {

        // if the year is century
        if (this.theDate.getYear() % 100 == 0) {

            // if year is divided by 400
            // then it is a leap year
            if (this.theDate.getYear() % 400 == 0)
                leap = true;
        }
        // if the year is not century
        else
            leap = true;
    }
    return leap;
}
}
