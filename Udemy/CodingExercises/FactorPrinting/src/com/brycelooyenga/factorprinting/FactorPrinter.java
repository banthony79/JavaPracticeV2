package com.brycelooyenga.factorprinting;

public class FactorPrinter {

    public static int printFactors(int number) {
        int remainder = 0;
        if (number <= 0) {
            System.out.println("Invalid Value");
            return -1;

        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                remainder = i;
                System.out.println(remainder);


            }
        }
        return remainder;
    }

}

