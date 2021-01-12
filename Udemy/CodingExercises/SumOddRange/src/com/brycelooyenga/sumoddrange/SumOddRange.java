package com.brycelooyenga.sumoddrange;


public class SumOddRange {


    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        } else if (number % 2 != 0) {
            return true;
        }
        return false;
    }


    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || end < start) return -1;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;

    }

}
