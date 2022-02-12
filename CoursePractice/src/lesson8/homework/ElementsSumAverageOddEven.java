package lesson8.homework;

import java.util.Scanner;

public class ElementsSumAverageOddEven {
    public static void main(String[] args) {
        int[] oneDimensionArr;
        int[][] twoDimensionArr;
        int oneDimLength, twoDimRow, twoDimCol;
        long numberEvenTwoDimArr = 0, sumTwoDimArr = 0, numberOddTwoDimArr = 0;
        Scanner readValue = new Scanner(System.in);
        System.out.print("Enter the length of your one dimension array: ");
        oneDimLength = ArrayUtilities.checkInput(readValue);
        oneDimensionArr = new int[oneDimLength];
        for (int i = 0; i < oneDimensionArr.length; i++) {
            int element = i;
            System.out.print("\nEnter the [" + ++element + "] element: ");
            oneDimensionArr[i] = ArrayUtilities.checkInput(readValue);
        }
        System.out.print("Enter the length of your two dimension array: Row: ");
        twoDimRow = ArrayUtilities.checkInput(readValue);
        System.out.print("Enter the length of your two dimension array: Column: ");
        twoDimCol = ArrayUtilities.checkInput(readValue);
        twoDimensionArr = new int[twoDimRow][twoDimCol];
        System.out.println("The values of the two dimensional array will be assigned in a random mode! ");
        for (int i = 0; i < twoDimRow; i++) {
            for (int j = 0; j < twoDimCol; j++) {
                twoDimensionArr[i][j] = ArrayUtilities.getRandomNumber(500, 2);
            }
        }
        System.out.println("The values of the one dimension array are! ");
        ArrayUtilities.printOneDimensionArray(oneDimensionArr);
        System.out.println("The sum of the values of the one dimension array is: " + ArrayUtilities.sumOfElementsArr(oneDimensionArr));
        System.out.println("The average value of one dimension array's elements is: " + ArrayUtilities.averageValueArr(oneDimensionArr));
        System.out.println("The number of even values of one dimension array is: " + ArrayUtilities.numberOfEvenArr(oneDimensionArr));
        System.out.println("The number of odd values of one dimension array is: " + ArrayUtilities.numberOfOddArr(oneDimensionArr));

        System.out.println("The values of the two dimension array are! ");
        ArrayUtilities.printTwoDimensionArray(twoDimensionArr, twoDimRow, twoDimCol);

        for (int j = 0; j < twoDimRow; j++) {
            sumTwoDimArr += ArrayUtilities.sumOfElementsArr(twoDimensionArr[j]);
        }
        System.out.println("\n\nThe sum of the values of the one dimension array is: " + sumTwoDimArr);
        System.out.println("The average value of one dimension array's elements is: " + (double) sumTwoDimArr / (twoDimCol * twoDimRow));
        for (int j = 0; j < twoDimRow; j++) {
            numberEvenTwoDimArr += ArrayUtilities.numberOfEvenArr(twoDimensionArr[j]);
        }
        System.out.println("The number of even values of one dimension array is: " + numberEvenTwoDimArr);
        for (int j = 0; j < twoDimRow; j++) {
            numberOddTwoDimArr += ArrayUtilities.numberOfOddArr(twoDimensionArr[j]);
        }
        System.out.println("The number of odd values of one dimension array is: " + numberOddTwoDimArr);

        readValue.close();
    }

}
