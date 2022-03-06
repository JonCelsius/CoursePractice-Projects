package com.lesson17.homework;

public class Lesson17App {
    public static void main(String[] args) {
        ValidationInput validationInput = new ValidationInput();
        CompareStrings compareStrings = new CompareStrings();
        DisplayNameAbbreviation displayNameAbbreviation = new DisplayNameAbbreviation();
        ReverseString reverseString = new ReverseString();
        HowManyWords howManyWords = new HowManyWords();
        int k;
        while (true) {
            System.out.println("-------------------------------------------------------------------------------");
            System.out.println("Enter the below option");
            System.out.println("1. Compare a given String to another String, ignoring the case consideration.");
            System.out.println("2. Display the abbreviation of the first and middle names except the last name.");
            System.out.println("3. Reverse a String (two methods used).");
            System.out.println("4. The amount of words in a String.");
            System.out.println("5. Exit the program.");
            System.out.println("-------------------------------------------------------------------------------");
            k = validationInput.checkIntInput();
            switch (k) {
                case 1:
                    compareStrings.compareTheStrings();
                    break;
                case 2:displayNameAbbreviation.setAndDisplayNameAbbreviation();
                    break;
                case 3:reverseString.displayWords();
                    break;
                case 4:howManyWords.displayHowManyWords();
                    break;
                case 5:
                    validationInput.closeScanner();
                    return;
                default:
                    System.out.println("?????????????????????????????????????????????");
                    System.out.println("\nSorry, you have entered a invalid option!\n");
                    System.out.println("?????????????????????????????????????????????");
            }

        }
    }
}
