package com.lesson12.homework;

public class ParkingSpot {

    double parkingTime;
    double parkingCharge;

    ParkingSpot(double parkingTime) {
        this.parkingTime = parkingTime;
    }

    public double calculateParkingCharge() {
        int days = (int) parkingTime / 24;
        parkingCharge = days * 10;
        double shortTime = parkingTime - (days * 24);
        if (shortTime == 0) {
            return parkingCharge;
        } else {

            parkingCharge += calculateShortTime(shortTime);
        }

        return parkingCharge;
    }


    public double calculateShortTime(double shortTime) {
        double charge;
        if (shortTime <= 3) {
            charge = 2;
        } else {
            charge = 2 + 0.5 * (shortTime - 3);
        }
        return charge;
    }
}

