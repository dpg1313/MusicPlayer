package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String title;
    private String imageUrl;
    private String artist;
    private String description;
    private ArrayList<Song> songs;
    public Album(String title, ArrayList<Song> songs, String imageUrl, String artist, String description) {
        this.imageUrl = imageUrl;
        this.artist = artist;
        this.description = description;
        this.title = title;
        this.songs = songs;
    }

    @Override
    public String toString() {
        return "Название: " + title + "Треклист: " + songs + imageUrl + "Исполнитель:" + artist + "Описание" + description;
    }
}
