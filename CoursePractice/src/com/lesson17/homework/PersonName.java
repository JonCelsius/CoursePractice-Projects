package com.lesson17.homework;


public class PersonName {
    private String name;
    private String nameAbbreviation;

    public PersonName(String name) {
        this.name = name;
        this.nameAbbreviation = gettingAbbreviation(setStringAbbreviation());
    }

    public String getName() {
        return name;
    }

    public String getNameAbbreviation() {
        return nameAbbreviation;
    }

    public String gettingAbbreviation(String[] abbreviationArr) {
        String abbreviation ="";
        for (String value : abbreviationArr) {
            abbreviation+=value;
        }
        return abbreviation;
    }

    public String[] setStringAbbreviation() {
        String[] nameStringArr = stringToStringArr(name);
        for (int i = 0; i < nameStringArr.length - 1; i++) {

            nameStringArr[i] = nameStringArr[i].substring(0, 1) + ". ";
        }
        for (String value : nameStringArr) {
            System.out.println(value);
        }
        return nameStringArr;


    }






    public String[] stringToStringArr(String name) {

        return name.split("\\s");
    }


}
