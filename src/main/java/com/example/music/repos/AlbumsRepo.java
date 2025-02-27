package com.example.music.repos;

import com.example.music.modele.Albums;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AlbumsRepo extends JpaRepository<Albums, Long> {
    public Albums findByNom(String albums_nom);
}
