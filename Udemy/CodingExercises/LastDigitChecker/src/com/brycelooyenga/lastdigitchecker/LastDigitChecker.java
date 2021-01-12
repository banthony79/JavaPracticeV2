package com.brycelooyenga.lastdigitchecker;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000) return false;
        int numlastdigit = num1 % 10;
        int numlastdigit2 = num2 % 10;
        int numlastdigit3 = num3 % 10;
        System.out.println(numlastdigit + ", " + numlastdigit2 + ", " + numlastdigit3);
        if (numlastdigit == numlastdigit2 || numlastdigit == numlastdigit3
                || numlastdigit2 == numlastdigit3) {
            return true;
        }
        return false;
    }

    public static boolean isValid(int num1) {
        if (num1 >= 10 && num1 <= 1000) {
            return true;
        } else return false;
    }

}
