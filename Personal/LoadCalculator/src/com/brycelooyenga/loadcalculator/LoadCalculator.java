package com.brycelooyenga.loadcalculator;

import java.util.Scanner;


public class LoadCalculator {


    public static void LoadCalculator(int tonnage, int roundsPerDay, int trucks) {
        int loads = tonnage / 30;
        int days = loads / (roundsPerDay * trucks);
        System.out.println("The job will take " + loads + " loads and will take " + days + " days at " + roundsPerDay + " rounds per day with " + trucks + " trucks.");
    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter tonnage for job");
        int tonnage = sc.nextInt();
        System.out.println("Please enter rounds per day");
        int roundsPerDay = sc.nextInt();
        System.out.println("Please enter number of trucks");
        int trucks = sc.nextInt();
        LoadCalculator(tonnage, roundsPerDay, trucks);

    }
}
