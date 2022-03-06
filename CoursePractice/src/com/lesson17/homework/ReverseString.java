package com.lesson17.homework;

public class ReverseString {
    private String wordToReverse;
    private String reversedWord;


    public void setWordToReverse() {
        ValidationInput validationInput = new ValidationInput();
        System.out.println("Enter the String you want to reverse");
        wordToReverse = validationInput.inputString();
    }

    public void setReversedWord() {
        this.reversedWord = getStringFromArr();
    }

    public char[] setStringArr() {
        char[] stringArr = new char[wordToReverse.length()];
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = wordToReverse.charAt(i);
        }
        return stringArr;
    }

    public char[] reverseStringArr() {
        char [] stringArr = setStringArr();
        char [] reverseStringArr = new char[stringArr.length];
        for (int i=stringArr.length-1,j=0;i>=0;i--,j++){
            reverseStringArr[j] = stringArr[i];
        }
        return reverseStringArr;
    }

    public String getStringFromArr(){
       return new String(reverseStringArr());
    }

    public StringBuilder reverseWordUsingReverse(){
        StringBuilder reversedWord = new StringBuilder(wordToReverse);
        return reversedWord.reverse();
    }
    public void displayWords(){
        setWordToReverse();
        setReversedWord();
        System.out.println("The reversed word using 'for' loop method: " + reversedWord);
        System.out.println("The reversed word using 'reverse()' method: " + reverseWordUsingReverse());
    }
}
