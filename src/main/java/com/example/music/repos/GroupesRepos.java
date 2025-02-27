package com.example.music.repos;

import com.example.music.modele.Groupes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface GroupesRepos extends JpaRepository<Groupes, Long> {
    Set<Groupes> findByNom(String groupe_nom);
}
