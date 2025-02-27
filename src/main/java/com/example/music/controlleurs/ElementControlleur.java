package com.example.music.controlleurs;

import com.example.music.modele.Albums;
import com.example.music.repos.AlbumsRepo;
import com.example.music.utils.AlbumsFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ElementControlleur {
    private AlbumsRepo albumsRepo;

    public ElementControlleur(AlbumsRepo albums) {
        this.albumsRepo = albums;
    }

    @GetMapping("/albums")
    public Albums getAlbumsFactory() {
        return AlbumsFactory.getBibSingleton();
    }
}
