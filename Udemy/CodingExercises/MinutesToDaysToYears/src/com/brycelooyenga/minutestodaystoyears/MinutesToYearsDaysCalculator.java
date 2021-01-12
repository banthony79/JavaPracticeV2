package com.brycelooyenga.minutestodaystoyears;

public class MinutesToYearsDaysCalculator {



    public static void printYearsandDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = (minutes / 525600);
            long remainingminutes = (minutes % 525600);
            long days = (remainingminutes / 1440);
            System.out.println(minutes + " min = " + years + " y" + " and " + days + " d");

        }

    }
}

