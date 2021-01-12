package com.BryceLooyenga.DuplicateValues;

import java.util.Scanner;

public class DuplicateValues {

    public static Scanner scanner = new Scanner(System.in);

    public static int[] getIntegers(int number) {
        int[] numArray = new int[number];
        System.out.println("Please enter " + number + " numbers");
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = scanner.nextInt();
        }
        return numArray;
    }

    private static void duplicateValues(int[] array) {
        int temp = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println("Duplicate element : " + array[j]);
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] bryceArray = getIntegers(5);
        duplicateValues(bryceArray);
    }
}
