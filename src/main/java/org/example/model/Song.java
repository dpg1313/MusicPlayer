package org.example.model;

public class Song {
    private String title;
    private int duration;
    private int order;
    private Genre genre;
    public Song(String title, int duration, int order) {
        this.title = title;
        this.duration = duration;
        this.order = order;
    }

    @Override
    public String toString() {
        return "Трек: " + title + " | Длительность: " + duration + " | №: " + order;
    }
}
