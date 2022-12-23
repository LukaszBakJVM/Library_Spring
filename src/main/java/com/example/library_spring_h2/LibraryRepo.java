package com.example.library_spring_h2;

import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public class LibraryRepo {
    private final EntityManager entityManager;

    public LibraryRepo(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void save(Library library){
        entityManager.persist(library);
    }
    public Optional<Library>findBookByIsbn(int isbn){
        return Optional.ofNullable(entityManager.find(Library.class,isbn));

    }
    public void remove( int isbn){
        findBookByIsbn(isbn).ifPresent(entityManager::remove);
    }
}
