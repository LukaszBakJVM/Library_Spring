package com.example.library_spring_h2;


import org.springframework.data.repository.CrudRepository;

import java.util.List;


interface LibraryRepo extends CrudRepository<Library,Long> {
   List<Library> findAllByDocumentNumberNull();






}
