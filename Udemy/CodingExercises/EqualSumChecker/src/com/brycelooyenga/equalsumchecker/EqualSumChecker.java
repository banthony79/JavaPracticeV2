package com.brycelooyenga.equalsumchecker;

public class EqualSumChecker {

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        int sum = (num1 + num2);
        if (sum == num3) {
            System.out.println("true");
            return true;
        } else {
            System.out.println("false");
            return false;
        }
    }
}
