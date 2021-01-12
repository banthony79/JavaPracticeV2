package com.brycelooyenga.decimalcomparator;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if (((int) (num1 * 1000) == (int) (num2 * 1000))) {
            System.out.println(num1 + " is equal to " + num2);
            return true;
        } else {
            System.out.println(num1 + " is not equal to " + num2);
            return false;
        }

    }
}


