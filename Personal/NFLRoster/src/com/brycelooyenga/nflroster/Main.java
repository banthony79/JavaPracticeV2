package com.brycelooyenga.nflroster;

public class Main {

    public static void main(String[] args) {

        Roster roster = new Roster();

        roster.loadPlayers("NFLRoster.csv");

        //roster.listPlayers();

        roster.listByPostion();
    }
}
