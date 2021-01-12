package com.brycelooyenga.evendigitsum;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {

        int evenDigitSum = 0;
        int lastDigit = 0;
        if (number < 0) return -1;
        while (number > 0) {
            lastDigit = number % 10;
            if (number % 2 == 0) evenDigitSum += number % 10;
            number = number / 10;
        }
        return evenDigitSum;
    }
}
