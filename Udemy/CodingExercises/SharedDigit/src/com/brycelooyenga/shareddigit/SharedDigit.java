package com.brycelooyenga.shareddigit;

//method to test if two numbers share a common digit

public class SharedDigit {

    //number has to be over 10 and under 100

    public static boolean hasSharedDigit(int number, int number2) {
        if (number < 10 || number > 99 || number2 < 10 || number2 > 99) {
            return false;
        }
        int firstDgit = number % 10;
        int secondDigit = number / 10;
        int firstDgit2 = number2 % 10;
        int secondDigit2 = number2 / 10;

        if (firstDgit == firstDgit2 || secondDigit == secondDigit2 ||
                firstDgit == secondDigit2 || firstDgit2 == secondDigit) return true;
        else return false;
    }

}
