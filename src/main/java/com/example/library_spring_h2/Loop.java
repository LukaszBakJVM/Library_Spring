package com.example.library_spring_h2;

import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class Loop {
    public Loop(Scanner scanner) {
        this.scanner = scanner;
    }

    private final   Scanner scanner;

    public void loopControl(){
        Options options;
        do {
            printOptions();
            options=Options.createOptions(scanner.nextInt());

        }while (options!=Options.EXIT);

    }


    private void printOptions(){
        System.out.println("Wybierz opcje");
        for (Options option:Options.values()
             ) {
            System.out.println(option);

        }
    }
}
