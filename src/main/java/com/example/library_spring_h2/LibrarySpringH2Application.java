package com.example.library_spring_h2;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaDelete;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.CriteriaUpdate;
import jakarta.persistence.metamodel.Metamodel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class LibrarySpringH2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(LibrarySpringH2Application.class, args);
        LibraryDto library = new LibraryDto("MMM", "mmm", 787, "horro", 56778);
        LibraryDto library1 = new LibraryDto("MMM", "mmm", 787, "horro", 56788878);
       LibraryService libraryService =run.getBean(LibraryService.class);
      libraryService.addNewBook(library);
       libraryService.addNewBook(library1);
      libraryService.rent(2L,2,"lukasz","Bak","oyiyi4");


    }




    }
