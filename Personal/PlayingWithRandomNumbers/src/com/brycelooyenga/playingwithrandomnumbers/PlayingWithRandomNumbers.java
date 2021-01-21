package com.brycelooyenga.playingwithrandomnumbers;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class PlayingWithRandomNumbers {


        public static Random rand = new Random();

        public static void randomNumberGenerator(int howManyNumbers, int range) {
            Set<Integer> numbers = new HashSet<>();
            for (int i = 1; i <= howManyNumbers; i++) {
                int randomNumber = rand.nextInt(range);
                numbers.add(randomNumber);
            }

            printNumber(numbers);
        }

        public static void printNumber(Set <Integer> numberList) {
            Iterator i = numberList.iterator();
            while (i.hasNext()) {
                System.out.println(i.next());
            }
        }


        public static void main(String[] args) {

            randomNumberGenerator(10, 100);
        }
    }


