package com.lesson17.homework;

public class DisplayNameAbbreviation {

    ValidationInput validationInput = new ValidationInput();

    public void setAndDisplayNameAbbreviation() {

        System.out.println("Enter the name!");
        PersonName personName = new PersonName(validationInput.inputString());

        System.out.println("\n\n\nThis is the name  " + personName.getName()+
                "\n" + "And the abbreviation! " + personName.getNameAbbreviation());


    }


}
