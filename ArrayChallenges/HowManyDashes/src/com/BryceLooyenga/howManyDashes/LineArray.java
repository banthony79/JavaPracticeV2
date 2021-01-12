package com.BryceLooyenga.howManyDashes;

//Write a program that writes a grid of user defined dashes

public class LineArray {

    public static String[] howManyDashes(int number) {
        String[] dashArray = new String[number];
        for (int i = 0; i < dashArray.length; i++) {
            dashArray[i] = " - ";
        }
        return dashArray;
    }


    public static void main(String[] args) {

        String[] bryceDashArray = howManyDashes(10);

        for (int i = 0; i < bryceDashArray.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < 10; j++) {
                System.out.print(bryceDashArray[i]);
            }
        }
    }
}
