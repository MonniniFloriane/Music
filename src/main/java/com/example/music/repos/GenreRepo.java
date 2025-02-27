package com.example.music.repos;

import com.example.music.modele.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface GenreRepo extends JpaRepository<Genre, Long> {
    public Optional<Genre> findByNom(String genre_nom);
}
