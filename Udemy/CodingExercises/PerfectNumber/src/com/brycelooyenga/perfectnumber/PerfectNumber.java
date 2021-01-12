package com.brycelooyenga.perfectnumber;

public class PerfectNumber {

    //A perfect number is a positive integer that is equal to the sum of its positive divisors

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                sum = sum + i;
                if (number == sum) {
                    return true;
                }
            }
        }
        return false;
    }


}
