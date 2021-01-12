package com.brycelooyenga.numberofdays;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 9999) {
            if (year % 4 == 0) {
                if (year % 100 != 0 || year % 400 == 0) {
                    return true;
                } else {
                }
                return false;
            }
            return false;
        }
        return false;
    }


    public static int getDaysinMonth(int month, int year) {
        if (year < 0 || year > 9999) {
            System.out.println("Invalid Entry");
            return -1;
        } else if (month > 12 || month < 1) {
            System.out.println("Invalid Entry");
            return -1;
        } else if (!isLeapYear(year) && month == 2) {
            int daysmonth = 28;
            System.out.println(daysmonth);
            return daysmonth;
        } else if (isLeapYear(year) && month == 2) {
            int daysmonth = 29;
            System.out.println(daysmonth);
            return daysmonth;
        } else if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12) {
            int daysmonth = 31;
            System.out.println(daysmonth);
            return daysmonth;
        } else if (month == 4 || month == 6 || month == 11 || month == 9) {
            int daysmonth = 30;
            System.out.println(daysmonth);
            return daysmonth;
        }
        return -1;
    }

}
