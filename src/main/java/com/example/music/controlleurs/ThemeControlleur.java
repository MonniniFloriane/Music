package com.example.music.controlleurs;

import com.example.music.modele.Groupes;
import com.example.music.repos.GroupesRepos;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ThemeControlleur {
    private GroupesRepos groupesRepos;

    public ThemeControlleur(GroupesRepos groupes) {
        this.groupesRepos = groupes;
    }

    @GetMapping("/groupe")
    public List<Groupes> getGroupes() {
        return groupesRepos.findAll();
    }

    @PostMapping("/addGroupe")
    public Groupes addGroupe(@RequestBody Groupes groupe) {
        return groupesRepos.save(groupe);
    }
}
