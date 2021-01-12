package com.brycelooyenga.intequalityprinter;

public class Main {

    //a program that checks whether all numbers are the same

    public static void main(String[] args) {
        IntEqualityPrinter.printEqual(1, 1, 1);
        IntEqualityPrinter.printEqual(1, 1, 2);
        IntEqualityPrinter.printEqual(-1, -1, -1);
        IntEqualityPrinter.printEqual(1, 2, 3);
        IntEqualityPrinter.printEqual(2, 2, 1);
    }
}
