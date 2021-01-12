package com.brycelooyenga.intequalityprinter;

public class IntEqualityPrinter {

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) System.out.println("Invalid Value");
        else if (x == y && x == z && z == y) System.out.println("All numbers are equal");
        else if (x != y && x != z && z != y) System.out.println("All numbers are different");
        else System.out.println("Neither all are equal or different");
    }
}
