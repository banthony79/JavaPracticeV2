package com.BryceLooyenga.ArrayContains;

import java.util.Scanner;

public class ArrayContains {

    private static Scanner scanner = new Scanner(System.in);

    public static int[] enterIntegers(int number) {

        int[] array = new int[number];
        System.out.println("Please enter " + number + " numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }


    public static void checkforInt(int[] array) {
        System.out.println("Please enter number");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("The array does contain a " + number);
                break;
            } else {
                System.out.println("The array does not contain a " + number);
                break;
            }
        }
    }


    public static void main(String[] args) {
        int[] brycesArray = enterIntegers(3);
        checkforInt(brycesArray);
    }


}
