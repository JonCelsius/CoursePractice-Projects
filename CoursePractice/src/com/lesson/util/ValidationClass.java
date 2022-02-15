package com.lesson.util;

import org.jetbrains.annotations.NotNull;

public class ValidationClass {

    public static boolean isValidPositiveDouble(double input) {
        return input > 0;
    }

    public static boolean isValidNameString(@NotNull String input) {
        String regex = "^[a-zA-Z ]+$";
        return input.matches(regex);
    }

    public static boolean isValidAddressString(@NotNull String input) {
        String regex = "^[a-zA-Z0-9._]+$";
        return input.matches(regex);
    }

}
