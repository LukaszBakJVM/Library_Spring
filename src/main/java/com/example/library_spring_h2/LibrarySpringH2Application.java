package com.example.library_spring_h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


import java.util.Scanner;

@SpringBootApplication
public class LibrarySpringH2Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(LibrarySpringH2Application.class, args);
       Loop loop =run.getBean(Loop.class);
        loop.loopControl();




    }

@Bean
    Scanner scanner() {
    return new Scanner(System.in);
}

}





