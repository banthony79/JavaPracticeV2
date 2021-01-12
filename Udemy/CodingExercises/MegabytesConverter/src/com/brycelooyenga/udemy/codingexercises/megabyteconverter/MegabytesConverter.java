package com.brycelooyenga.udemy.codingexercises.megabyteconverter;

public class MegabytesConverter {

    public static void printMegaBytesandKiloBytes(int kiloBytes) {
        int megabyte = (kiloBytes / 1024);
        int megabyteRemainder = (kiloBytes % 1024);

        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB" + " = "
                    + megabyte + " MB and " + megabyteRemainder + " KB");
        }

    }
}