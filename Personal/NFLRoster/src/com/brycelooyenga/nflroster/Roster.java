package com.brycelooyenga.nflroster;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class Roster {

    private LinkedList<Player> players;

    public Roster() {
        this.players = new LinkedList<>();
    }


    public void loadPlayers(String fileName) {
        Scanner fileScanner = null;

        try {
            fileScanner = new Scanner(Paths.get(fileName));
           while (fileScanner.hasNextLine()) {

               String line = fileScanner.nextLine();
               String[] playerArray = line.split(",");
               String name = playerArray[2];
               String team = playerArray[4];
               String position = playerArray[5];
               addPlayer(name, team, position);
           }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileScanner != null) {
                fileScanner.close();
            }
        }
    }


    public void addPlayer(String name, String team, String position) {
        players.add(new Player(name, team, position));
    }

    public void listPlayers() {
        for (Player player: players) {
            System.out.println(player);
        }
    }

    public void listByPostion() {
        players.stream()
                .map(player -> player.getPosition())
                .sorted()
                .forEach(System.out::println);

    }


    }
