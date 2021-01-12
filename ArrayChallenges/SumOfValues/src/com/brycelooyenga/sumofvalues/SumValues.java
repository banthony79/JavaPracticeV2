package com.brycelooyenga.sumofvalues;

import java.util.Scanner;

public class SumValues {

    private static Scanner input = new Scanner(System.in);

    public static int[] enterIntegers(int number) {
        int[] numArray = new int[number];
        System.out.println("Please enter " + number + " numbers");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = input.nextInt();
        }
        return numArray;
    }

    public static int sumofArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static double averageofArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum / array.length;
    }


    public static void main(String[] args) {

        int[] bryceArray = enterIntegers(5);
        System.out.println("The sum of your array is " + sumofArray(bryceArray));
        System.out.println("The average of your array is " + averageofArray(bryceArray));
    }


}
