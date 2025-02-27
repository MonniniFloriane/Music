package com.example.lego.modele;

import jakarta.persistence.*;

@Entity
public class Sets {
    @Id @GeneratedValue
    protected Long id;

    protected String name;

    public Sets() {}

    public Sets(String name) {
        this.name = name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
