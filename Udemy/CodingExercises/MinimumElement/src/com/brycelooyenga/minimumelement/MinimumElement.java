package com.brycelooyenga.minimumelement;

import java.util.Scanner;

public class MinimumElement {

    public static int readInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = Integer.valueOf(scanner.nextLine());

   return number;  }


   public static int [] readElements(int number) {
       Scanner scanner = new Scanner(System.in);
       int num = 0;
       int [] array = new int [number];
       System.out.println("Enter " + number +  " numbers");
       for (int i = 0; i < number; i++) {

           num = Integer.valueOf(scanner.nextLine());
           array[i] = num;
       }

  return array;   }


    public static int findMin(int [] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
   return min;  }


    public static void main(String[] args) {

        int number = readInteger();
        int [] array = readElements(number);
        System.out.println("The min number in the array is " + findMin(array));



    }

}
