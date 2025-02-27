package com.example.lego.modele;

import jakarta.persistence.*;

@Entity
public class Collectionneur {
    @Id
    protected Long collectionneur_ID;

    protected String nom;
    protected String ville;
    protected String specialite;
    protected int sets;

    public Collectionneur() {}

    public void setId(Long collectionneur_ID) {
        this.collectionneur_ID = collectionneur_ID;
    }

    public Long getId() {
        return collectionneur_ID;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getVille() {
        return ville;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getSets() {
        return sets;
    }
}
