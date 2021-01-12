package com.BryceLooyenga.CompareValues;

public class CompareTwoValues {

    //Return a boolean based on whether the same value appears in an array

    public static boolean arrayEqualValues(int[] array) {

        int count = 0;
        for (int i = 0; i < array.length; i++) {

            for (int t = i + 1; t < array.length; t++) {
                if (array[i] == array[t] && i != t) {
                    count++;
                }
            }
        }
        if (count > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int[] array1 = {5, 6, 7, 7};
        int[] array2 = {1, 2};
        int[] array3 = {12, 24, 48, 72, 100, 72};

        System.out.println(arrayEqualValues(array1));
        System.out.println(arrayEqualValues(array2));
        System.out.println(arrayEqualValues(array3));


    }
}
