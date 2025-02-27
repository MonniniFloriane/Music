package com.example.music.controlleurs;

import com.example.music.modele.Groupes;
import com.example.music.repos.GroupesRepos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
}
