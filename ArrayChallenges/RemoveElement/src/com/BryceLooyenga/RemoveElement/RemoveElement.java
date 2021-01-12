package com.BryceLooyenga.RemoveElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Remove a user defined element from an Array of user entered numbers

public class RemoveElement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] array =  enterIntegers(4);
        System.out.println("Please type the index of the element you want to remove");
        int x = Integer.valueOf(scan.nextLine());
        ArrayList<Integer> list = removeElement(x, array);
        int [] newArray = listIntoArray(list);

        System.out.println(Arrays.toString(newArray));


    }

    public static int[] enterIntegers(int number) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[number];
        System.out.println("Please enter " + number + " numbers");
        for (int i = 0; i < array.length; i++) {
            array[i] = scan.nextInt();
        }

        return array;
    }

    public static ArrayList<Integer> removeElement(int num, int [] array) {
       ArrayList<Integer> list = new ArrayList<>();
        for (Integer number: array) {
            list.add(number);
        }

        list.remove(num);
  return list;
    }



    public static int [] listIntoArray(ArrayList<Integer> list) {
        int [] array = new int [list.size()];

       for (int i = 0; i < array.length; i++) {
           array[i] = list.get(i);
       }
    return array;
    }

}

