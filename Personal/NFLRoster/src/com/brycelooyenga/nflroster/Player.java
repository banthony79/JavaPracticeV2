package com.brycelooyenga.nflroster;

public class Player  {

    private String name;
    private String team;
    private String position;



    public Player(String name, String team, String position) {
        this.name= name;
        this.team = team;
        this.position = position;
    }

    public String getName() {
        return this.name;
    }

    public String getPosition() {
        return position;
    }

    public String getTeam() {
        return team;
    }

    public String toString() {
        return this.name + ", " + this.team + ", " + this.position;
    }



}
