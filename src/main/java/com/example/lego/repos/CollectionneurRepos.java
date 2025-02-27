package com.example.lego.repos;

import com.example.lego.modele.Collectionneur;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface CollectionneurRepos extends JpaRepository<Collectionneur, Integer> {
    Set<Collectionneur> findByNom(String nom);
}
