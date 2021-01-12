package com.brycelooyenga.inputcalculator;

import java.util.Scanner;

public class InputCalculator {


    public static void InputThenPrintSumAndAverage() {
        int count = 0;
        int sum = 0;
        double avg = 0;
        double number = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");

        while (true) {
            boolean isAnInt = sc.hasNextInt();

            if (isAnInt) {
                count++;
                number = sc.nextInt();
                sum += number;

            } else {
                avg = (double) sum / count;
                long avground = (long) Math.round(avg);
                System.out.println("SUM = " + sum + " AVG = " + avground);
                break;
            }

        }


    }
}
