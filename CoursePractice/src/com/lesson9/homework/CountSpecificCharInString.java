package com.lesson9.homework;


class CountSpecificCharInString {

    public static void countString(String enteredString, char characterToFind) {
        int count = 0;
        char[] convertedString = convertStringToCharArr(enteredString);
        for (char value : convertedString) {
            if (characterToFind == value) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Your character {" + characterToFind + "} is NOT found!");
        } else {
            System.out.println("Your character {" + characterToFind + "} has been found : [" + count + "] times");
        }

    }

    public static char[] convertStringToCharArr(String enteredString) {
        char[] ch = new char[enteredString.length()];
        for (int i = 0; i < enteredString.length(); i++) {
            ch[i] = enteredString.charAt(i);
        }
        return ch;
    }
}
