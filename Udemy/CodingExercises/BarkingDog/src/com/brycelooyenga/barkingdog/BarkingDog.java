package com.brycelooyenga.barkingdog;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay, String dogName) {
        if (hourOfDay < 0 || hourOfDay > 23)
            return false;
        else if ((barking == true && hourOfDay < 8) || (barking == true && hourOfDay > 22)) {
            System.out.println(dogName + ": bark bark!");
            return true; }
        else {
            System.out.println(dogName + " is sleeping");
            return false;
        }

    }

}