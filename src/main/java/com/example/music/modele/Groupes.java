package com.example.music.modele;

import jakarta.persistence.*;

@Entity
public class Groupes {

    @Column(name= "groupe_nom")
    protected String nom;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long groupe_ID;

    protected String groupe_chanteur;
    protected String groupe_origin;

    public Groupes() {}

    public Groupes(String nom, String groupe_chanteur, String groupe_origin) {
        this.nom = nom;
        this.groupe_chanteur = groupe_chanteur;
        this.groupe_origin = groupe_origin;
    }

    public void setId(Long groupe_ID) {
        this.groupe_ID = groupe_ID;
    }

    public Long getId() {
        return groupe_ID;
    }

    public void setNom(String groupe_nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setChanteur(String groupe_chanteur) {
        this.groupe_chanteur = groupe_chanteur;
    }

    public String getChanteur() {
        return groupe_chanteur;
    }

    public void setOrigin(String groupe_origin) {
        this.groupe_origin = groupe_origin;
    }

    public String getOrigin() {
        return groupe_origin;
    }
}
