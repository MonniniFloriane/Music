package com.example.lego.modele;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Collection {

    @Id
    protected Long id;

    protected String name;
    protected int nbr_scenes;
    protected int nbr_pieces;
    protected int nbr_minifigs;

    @ManyToOne
    @JoinColumn(name = "collectionneur_ID")
    protected Collectionneur collectionneur = new Collectionneur();

    protected String image;
    protected String description;

    @OneToMany
    private List<Sets> set = new ArrayList<>();

    public Collection() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNbr_scenes(int nbr_scenes) {
        this.nbr_scenes = nbr_scenes;
    }

    public int getNbr_scenes() {
        return nbr_scenes;
    }

    public void setNbr_pieces(int nbr_pieces) {
        this.nbr_pieces = nbr_pieces;
    }

    public int getNbr_pieces() {
        return nbr_pieces;
    }

    public void setNbr_minifigs(int nbr_minifigs) {
        this.nbr_minifigs = nbr_minifigs;
    }

    public int getNbr_minifigs() {
        return nbr_minifigs;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
