package com.brycelooyenga.reversearray;

import java.util.Arrays;

public class ReverseArray {

    private static void reverseArray(int [] oldArray) {
        int arrayLength= oldArray.length;
        int [] newArray = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            newArray[i] =  oldArray[(arrayLength - 1) - i];
        }

        System.out.println("Array = " + Arrays.toString(oldArray));
        System.out.println("Reversed Array = " + Arrays.toString(newArray));


    }


    public static void main(String[] args) {

        reverseArray(new int [] {1, 5, 6, 8, 9});

    }



}
