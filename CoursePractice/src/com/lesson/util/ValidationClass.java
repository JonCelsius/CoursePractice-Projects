package com.lesson.util;



public class ValidationClass {
    /**
     *Checks if a double number is positive and not 0.
     * @param input - double value
     * @return true if input > 0
     */
    public static boolean isValidPositiveDouble(double input) {
        return input > 0;
    }

    /**
     *Checks if a string input has the specified symbols in it and returns a true or false value.
     * @param input - string input
     * @return true if it matches
     */
    public static boolean isValidNameString( String input) {
        String regex = "^[a-zA-Z ]+$";
        return input.matches(regex);
    }

    public static boolean isValidAddressString( String input) {
        String regex = "^[a-zA-Z0-9._]+$";
        return input.matches(regex);
    }

}
