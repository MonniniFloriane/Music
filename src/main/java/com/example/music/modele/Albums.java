package com.example.music.modele;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Albums {

    @Column(name="albums_nom")
    protected String nom;

    @Id
    @GeneratedValue
    protected Long albums_ID;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "albums_artistes")
    protected Groupes groupe_ID;

    protected int albums_pistes;
    protected String albums_date;
    protected String albums_couverture;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "nom")
    protected List<Genre> genreList = new ArrayList<>();

    public Albums() {}

    public Albums(String nom, Groupes groupe_ID, int albums_pistes, String albums_date, String albums_couverture, List<Genre> genreList) {
        this.nom = nom;
        this.groupe_ID = groupe_ID;
        this.albums_pistes = albums_pistes;
        this.albums_date = albums_date;
        this.albums_couverture = albums_couverture;
        this.genreList = genreList;
    }

    public void setId(Long albums_ID) {
        this.albums_ID = albums_ID;
    }

    public Long getId() {
        return albums_ID;
    }

    public String getAlbums_nom() {
        return nom;
    }

    public void setAlbums_nom(String albums_nom) {
        this.nom = nom;
    }

    public Groupes getAlbums_artistes() {
        return groupe_ID;
    }

    public void setAlbums_artistes(Groupes groupe_ID) {
        this.groupe_ID = groupe_ID;
    }

    public int getAlbums_pistes() {
        return albums_pistes;
    }

    public void setAlbums_pistes(int albums_pistes) {
        this.albums_pistes = albums_pistes;
    }

    public String getAlbums_date() {
        return albums_date;
    }

    public void setAlbums_date(String albums_date) {
        this.albums_date = albums_date;
    }

    public String getAlbums_couverture() {
        return albums_couverture;
    }

    public void setAlbums_couverture(String music_couverture) {
        this.albums_couverture = music_couverture;
    }
    public List<Genre> getGenreList() {
        return genreList;
    }
}
