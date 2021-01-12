package com.brycelooyenga.leapyear;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 9999) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                    return true;
                } else {
                }
                System.out.println(year + " is not a leap year.");
                return false;
            }
            System.out.println(year + " is not a leap year.");
            return false;
        }
        System.out.println(year + " is not a leap year.");
        return false;
    }
}


//The year can be evenly divided by 4;
//If the year can be evenly divided by 100, it is NOT a leap year, unless;
//The year is also evenly divisible by 400. Then it is a leap year.