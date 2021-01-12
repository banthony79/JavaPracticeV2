package com.brycelooyenga.playingcat;

public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = 35;
        if (summer) {
            upperLimit = 45;
        }
        if ((temperature >= 25) && (temperature <= upperLimit)) {
            return true;
        }
        return false;
    }
}