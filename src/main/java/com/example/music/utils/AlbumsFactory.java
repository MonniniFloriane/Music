package com.example.music.utils;

import com.example.music.modele.Albums;
import com.example.music.modele.Genre;
import com.example.music.modele.Groupes;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AlbumsFactory {
    private static Optional<Albums> bibSingleton = Optional.empty();

    public static Albums getBibSingleton() {
        if (bibSingleton.isPresent()) {
            return bibSingleton.get();
        }

        List<Groupes> groupes = new ArrayList<>();
        groupes.add(new Groupes("System Of A Down", "Serj Tankian", "Glendale"));
        groupes.add(new Groupes("Mika", "Michael Holbrook", "Beyrouth"));
        groupes.add(new Groupes("Muse", "Matthew Bellamy", "Royaume-Uni"));

        List<Genre> genres = new ArrayList<>();
        genres.add(new Genre("heavy metal"));
        genres.add(new Genre("hard rock"));
        genres.add(new Genre("alternative metal"));

        Albums albums = new Albums("Hypnotize", new Groupes(), 12, "2005", "https://upload.wikimedia…_Of_A_Down-Hypnotize.jpg", genres);
        bibSingleton = Optional.of(albums);
        return albums;
    }
}
