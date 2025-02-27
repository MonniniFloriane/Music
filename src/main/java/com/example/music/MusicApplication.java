package com.example.music;

import com.example.music.modele.Albums;
import com.example.music.modele.Genre;
import com.example.music.modele.Groupes;
import com.example.music.repos.AlbumsRepo;
import com.example.music.repos.GenreRepo;
import com.example.music.repos.GroupesRepos;
import com.example.music.utils.AlbumsFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MusicApplication.class, args);
    }

    @Bean
    CommandLineRunner initRepos(AlbumsRepo albumsRepo, GroupesRepos groupesRepos, GenreRepo genreRepos) {
        return args -> {
            Albums albums1 = AlbumsFactory.getBibSingleton();
            Groupes groupe1 = new Groupes("System Of A Down", "Serj Tankian", "Glendale");
            Genre genre1 = new Genre("Hard-rock");

            albumsRepo.save(albums1);
            groupesRepos.save(groupe1);
            genreRepos.save(genre1);
        };
    }
}
