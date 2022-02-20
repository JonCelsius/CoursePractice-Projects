package com.lesson10.homework;

class Problem3 {
    public static void createWrapper() {
        Boolean booleanObj = Boolean.valueOf("tRue");
        Byte byteObj = 120;
        Short shortObj = (short) 32000;
        Integer intObj = 147895632;
        Long longObj = 987654321987654321L;
        Double doubleObj = 444.5d;
        Float floatObj = 2354.56f;

        System.out.println("---Printing object values---");
        System.out.println("Byte object: " + byteObj);
        System.out.println("Short object: " + shortObj);
        System.out.println("Integer object: " + intObj);
        System.out.println("Long object: " + longObj);
        System.out.println("Float object: " + floatObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Boolean object: " + booleanObj);


    }
}
