package com.lesson9.homework;

public class RectangleArea {
    private double width, length;

    void setWidth(double width) {
        this.width = width;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getArea(double width, double length) {
        return width * length;
    }

    @Override
    public String toString() {
        return "RectangleArea{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }


}
