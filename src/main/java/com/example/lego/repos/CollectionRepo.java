package com.example.lego.repos;

import com.example.lego.modele.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CollectionRepo extends JpaRepository<Collection, Integer> {
    public Collection findByName(String name);
    Set<Collection> findByCollectionneur_id(long collectionneur_ID);
}
