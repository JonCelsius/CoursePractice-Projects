package com.lesson17.homework;

public class HowManyWords {
    private String sentence;
    private String formattedSentence;
    private int wordCount;

    public void setSentence() {
        ValidationInput validationInput = new ValidationInput();
        System.out.println("Enter the String you want to reverse");
        sentence = validationInput.inputString();
    }

    public void setFormattedSentence() {
        this.formattedSentence = new String(formatCharArr());
    }

    public void setWordCount() {
        this.wordCount = countWords();
    }

    public String getSentence() {
        return sentence;
    }

    public String getFormattedSentence() {
        return formattedSentence;
    }

    public int getWordCount() {
        return wordCount;
    }

    public char[] getCharArr() {
        char[] charArr = new char[sentence.length()];
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = sentence.charAt(i);
        }
        return charArr;
    }

    public char[] formatCharArr() {
        char[] charArr = sentence.toCharArray();
        char[] formattedCharArr = new char[charArr.length];
        int counter = 0;
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i] != ' ') {
                formattedCharArr[i] = charArr[i];
                counter = 0;
            } else {
                if (counter < 1) {
                    formattedCharArr[i] = charArr[i];
                    counter++;
                }


            }
        }

        return formattedCharArr;
    }

    public int countWords() {
        return formattedSentence.split("\\s").length;
    }

    public void displayHowManyWords() {
        setSentence();
        System.out.println("The sentence you entered is: " + getSentence());
        setFormattedSentence();
        System.out.println("The formatted sentence is: " + getFormattedSentence());
        setWordCount();
        System.out.println("\n\nThe number of words in your sentence is: " + getWordCount());

    }
}
