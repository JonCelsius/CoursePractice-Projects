package com.lesson17.homework;

public class CompareStrings {
    String compare1;
    String compare2;

    public void setCompare1(String compare1) {
        this.compare1 = compare1;
    }

    public void setCompare2(String compare2) {
        this.compare2 = compare2;
    }

    public String getCompare1() {
        return compare1;
    }

    public String getCompare2() {
        return compare2;
    }

    public void compareTheStrings() {
        ValidationInput validationInput = new ValidationInput();
        System.out.println("Enter the first String sentence");
        setCompare1(validationInput.inputString());
        System.out.println("\nEnter the second String sentence");
        setCompare2(validationInput.inputString());
        if (compare1.equalsIgnoreCase(compare2)) {
            System.out.println("The first String [" + getCompare1() + "] and the second String ["
                    + getCompare2() + "] are the same, so are they equal? TRUE");
        } else {
            System.out.println("The first String [" + getCompare1() + "] and the second String ["
                    + getCompare2() + "] are different, so are they equal? FALSE");
            for (String value:compare1.split(" ")){
                System.out.println(value);
            }


        }
    }
}
