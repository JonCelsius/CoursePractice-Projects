package com.lesson9.homework;

import org.jetbrains.annotations.NotNull;

class PinLogIn {
    private static final String PIN = "267";

    public static boolean pinCheck(@NotNull String yourPin) {
        return yourPin.equals(PIN);
    }
}
