package org.example;

import org.example.model.Album;
import org.example.model.Song;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Song> songs;
        songs = new ArrayList<>(List.of(
                new Song ("new song", 400, 1),
                new Song ("new song3", 500, 9),
                new Song ("new song2", 1200, 6)
                )
        );
Album album1;
album1 = new Album("1",songs,"2323","12аываыв","аываываыв");

    System.out.print(album1);
    }
}

