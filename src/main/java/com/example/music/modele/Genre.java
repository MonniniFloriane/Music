package com.example.music.modele;

import jakarta.persistence.*;

@Entity
public class Genre {
    @Id @GeneratedValue @Column(name="genre_ID")
    protected Long id;

    @Column(name="genre_nom")
    protected String nom;

    public Genre() {}

    public Genre(String nom) {
        this.nom = nom;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
