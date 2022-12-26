package com.example.library_spring_h2;

import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class Loop {
    private final   Scanner scanner;
    private final LibraryService libraryService;

    public Loop(Scanner scanner, LibraryService libraryService) {
        this.scanner = scanner;
        this.libraryService = libraryService;
    }

    public void loopControl(){
        Options options;
        do {
            printOptions();
            options=Options.createOptions(scanner.nextInt());
            switch (options){
                case ADD -> libraryService.addNewBook(addBook());
            }

        }while (options!=Options.EXIT);

    }


    private void printOptions(){
        System.out.println("Wybierz opcje");
        for (Options option:Options.values()
             ) {
            System.out.println(option);

        }
    }
    private LibraryDto addBook(){
        System.out.println("Podaj nazwe ksiazki");
        String bookName=scanner.next();
        System.out.println("Podaj Autora");
        String author=scanner.next();
        System.out.println("Podaj ilosc stron");
        int pagesNumber=scanner.nextInt();
        System.out.println("Podaj kategorie");
        String category =scanner.next();
        System.out.println("Podaj numer ISBN");
        int isbn=scanner.nextInt();
        return new LibraryDto(bookName,author,pagesNumber,category,isbn);
    }
}
