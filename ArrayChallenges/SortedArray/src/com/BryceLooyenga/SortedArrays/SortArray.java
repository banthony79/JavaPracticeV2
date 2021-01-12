package com.BryceLooyenga.SortedArrays;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {

        int[] intArray = {10, 12, 15, 100, 61, 75};
        String[] stringArray = {"book", "desk", "pencils", "television", "ps4", "coffee"};

        Arrays.sort(intArray);
        Arrays.sort(stringArray);

        System.out.println("The sorted numerical array: ");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }


        System.out.println("The sorted string array: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }
}
