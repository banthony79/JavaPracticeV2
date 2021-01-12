package com.brycelooyenga.numberpalindrome;

public class NumberPalindrone {

    public static boolean isPalindrone(int number) {
        int reverse = 0;
        int lastDigit = 0;
        int originalNumber = number;

        while (number != 0) {
            lastDigit = number % 10;
            System.out.println(lastDigit);
            reverse = (reverse * 10) + lastDigit;
            System.out.println(reverse);
            number = number / 10;
            System.out.println(number);
            if (reverse == originalNumber) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println(isPalindrone(5005));
    }

}
