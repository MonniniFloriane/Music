package com.example.music.controlleurs;

import com.example.music.modele.Genre;
import com.example.music.repos.GenreRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TableauControlleur {
    private GenreRepo genreRepo;

    public TableauControlleur(GenreRepo genre) {
        this.genreRepo = genre;
    }

    @GetMapping("/genre")
    public List<Genre> getGenre() {
        return genreRepo.findAll();
    }
}
