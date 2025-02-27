package com.example.music.controlleurs;

import com.example.music.modele.Albums;
import com.example.music.modele.Genre;
import com.example.music.repos.AlbumsRepo;
import com.example.music.utils.AlbumsFactory;
import org.springframework.web.bind.annotation.*;

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

    @PatchMapping("/addGenre/{id}")
    public void updateAlbums(@PathVariable Long id, @RequestBody Albums albums) {
        Albums albumsAux = albumsRepo.findById(id).get();
        albumsAux.getGenreList().add(new Genre());

        albumsRepo.save(albumsAux);
    }

    @DeleteMapping("/albums/{id}")
    public void deleteAlbums(@PathVariable Long id) {
        albumsRepo.deleteById(id);
    }
}
