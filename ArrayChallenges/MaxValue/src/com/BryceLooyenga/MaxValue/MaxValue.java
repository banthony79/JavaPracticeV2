package com.BryceLooyenga.MaxValue;

import java.util.Scanner;

public class MaxValue {


    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        int[] numArray = new int[number];
        System.out.println("Please enter " + number + " numbers");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }
        return numArray;
    }


    public static int returnMax(int [] array) {
        int maxNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNumber) {
                maxNumber = array[i];
            }
        }
   return maxNumber;  }


    public static void main(String[] args) {

        System.out.println(returnMax(getIntegers(4)));

    }

}

   /* public static int maxValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[i + 1]) {
            }
        }
    //}
}*/
