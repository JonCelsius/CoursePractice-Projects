package lesson6homework;

public class TernaryOperatorDemo5{
    public static void main(String[] args) {
        int colorCode = 100;
        String color = null, color1 = null;
        switch(colorCode) {
            case 100 :
                color = "Yellow";
                break;
            case 101 :
                color = "Green";
                break;
            case 102 :
                color = "Red";
                break;
            default :
                color = "Invalid";
        }
        color1 = (colorCode==100)?"Yellow":(colorCode==101)?"Green":(colorCode==102)?"Red":"Invalid";

        System.out.println("Color is "+color);
        System.out.println("Color is "+color1);





    }
}
