package com.brycelooyenga.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) == null) {
            songs.add(new Song(songTitle, duration));
            return true;
        }
   return false;  }


    private Song findSong(String songTitle) {
        for (Song song: songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
   return null; }


   public boolean addToPlayList(int trackNumber, LinkedList<Song> songList) {
        if (trackNumber <= songs.size()) {
            Song found = songs.get(trackNumber - 1);
            songList.add(found);
            return true;
        } else {
            return false;
        }
 }


  public boolean addToPlayList(String songName, LinkedList<Song> songList) {
        if (findSong(songName) != null) {
            Song found = findSong(songName);
            songList.add(found);
            return true;
        }
 return false;  }
}
