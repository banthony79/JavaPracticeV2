package com.brycelooyenga.areacalculator;

public class AreaCalculator {

    private static final String INVALID_VALUE_NAME = "Invalid Entry";

    public static double area(double radius) {

        if (radius < 0) {
            System.out.println(INVALID_VALUE_NAME);
            return -1;
        }
        double circleArea = radius * radius * Math.PI;
        System.out.println("The area of the circle is " + circleArea);
        return circleArea;
    }

    public static double area(double x, double y) {
        if (x < 0 && y < 0 || x < 0 || y < 0) {
            System.out.println(INVALID_VALUE_NAME);
            return -1;
        }
        double rectangleArea = x * y;
        System.out.println("The area of the rectangle is " + rectangleArea);
        return rectangleArea;
    }

}

