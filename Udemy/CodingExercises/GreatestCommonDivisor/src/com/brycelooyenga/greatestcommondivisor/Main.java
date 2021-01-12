package com.brycelooyenga.greatestcommondivisor;

//a program that finds the greatest common divisior among two numbers

public class Main {

    public static void main(String[] args) {

        System.out.println("The greatest common divisor is " +
                GreatestCommonDivisor.getGreatestCommonDivisor(35, 60));
        System.out.println("The greatest common divisor is " +
                GreatestCommonDivisor.getGreatestCommonDivisor(12, 30));
        System.out.println("The greatest common divisor is " +
                GreatestCommonDivisor.getGreatestCommonDivisor(9, 18));
        System.out.println("The greatest common divisor is " +
                GreatestCommonDivisor.getGreatestCommonDivisor(81, 153));
        System.out.println("The greatest common divisor is " +
                GreatestCommonDivisor.getGreatestCommonDivisor(-100, 8));

    }
}
