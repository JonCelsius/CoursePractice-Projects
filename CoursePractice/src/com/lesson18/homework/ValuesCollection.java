package com.lesson18.homework;

import com.lesson17.homework.ValidationInput;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ValuesCollection {

    public static ArrayList<String> initValueCollection(){
        ArrayList<String> strings = new ArrayList<>();
        int numberOfValues;
        ValidationInput validationInput = new ValidationInput();
        System.out.println("Enter the number of values you want to enter!");
        numberOfValues = validationInput.checkIntInput();
        for (int i=0;i<numberOfValues;i++){
            System.out.print("Enter the string:" );
            strings.add(i, validationInput.inputString());
            System.out.println();
        }
        return strings;
    }
    public static void printValuesCollection(ArrayList<String> strings){
        for (String value: strings){
            System.out.println(value);
        }
    }

    public static void displayUniqueValues(ArrayList<String> strings){
        Set<String> setValuesCollection = new HashSet<>(strings);
        for (String value: setValuesCollection){ ;
            System.out.println(value);
        }
    }
}
