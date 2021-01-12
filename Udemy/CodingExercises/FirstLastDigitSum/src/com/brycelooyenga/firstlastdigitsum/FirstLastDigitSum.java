package com.brycelooyenga.firstlastdigitsum;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        int sum = 0, firstDigit = 0, lastDigit = 0;
        while (number >= 0) {
            lastDigit = number % 10;
            System.out.println(lastDigit);
            number = number / 10;
        }
        sum = firstDigit + lastDigit;
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        sumFirstAndLastDigit(12);

    }
}