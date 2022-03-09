package com.lesson18.homework;

import com.lesson17.homework.ValidationInput;

import java.util.HashMap;
import java.util.Map;

public class EnRoDictionary {

    public static Map<String, String> enRoDictionaryInit() {
        Map<String, String> enRoDictionary = new HashMap<>();
        ValidationInput validationInput = new ValidationInput();
        int numberOfWords;
        System.out.print("Enter the number of words in the dictionary: ");
        numberOfWords = validationInput.checkIntInput();
        for (int i = 0; i < numberOfWords; i++) {
            System.out.println("Enter the words starting with english then romanian ");
            enRoDictionary.put(validationInput.inputString(), validationInput.inputString());
        }

        return enRoDictionary;
    }

    public static void printEnRoDictionary(Map<String, String> enRoDictionary) {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("----------------------English-Romanian Dictionary------------------------------");
        for (Map.Entry<String,String> value : enRoDictionary.entrySet()) {
            System.out.println(value.toString());
            System.out.println();
            System.out.println(value.getKey() + " - " + value.getValue());
        }
        for(String s:enRoDictionary.keySet()){
            System.out.println();
            System.out.println(enRoDictionary.get(s));
        }
        System.out.println("-------------------------------------------------------------------------------");
    }
}
