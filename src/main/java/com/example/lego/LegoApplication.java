package com.example.lego;

import com.example.lego.modele.Collection;
import com.example.lego.repos.CollectionRepo;
import com.example.lego.repos.CollectionneurRepos;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LegoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegoApplication.class, args);
    }

    @Bean
    CommandLineRunner initRepos(CollectionRepo collectionBDD, CollectionneurRepos collectionneurBDD) {
        return args -> {
            Collection collection1 = new Collection("Bionicles forever", 40, 2000, 130, "https://fr.wikipedia.org/Exo-Toa.jpg", "Les Bionicle sont des personnages de l'univers Lego.");

            collectionBDD.save(collection1);
        };
    }
}
