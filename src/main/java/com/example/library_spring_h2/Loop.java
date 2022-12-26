package com.example.library_spring_h2;

import org.springframework.stereotype.Service;

import java.util.Scanner;
@Service
public class Loop {
    private final Scanner scanner;

    private final LibraryService libraryService;


    public Loop(Scanner scanner, LibraryService libraryService) {
        this.scanner = scanner;
        this.libraryService = libraryService;

    }

    public void loopControl() {
        Options options;
        do {
            printOptions();
            options = Options.createOptions(scanner.nextInt());
            switch (options) {
                case EXIT -> exit();
                case ADD -> libraryService.addNewBook(addBook());
               case RENT -> libraryService.rent(id(),firstName(),lastName(),documentNumber(),dayOfRent());
                case RETURN_BOOK -> libraryService.returnBook(id());
                case PRINT_ALL_BOOKS -> libraryService.printAllBooks();
                case DELETE_BOOK -> libraryService.delte(id());
                case PRINT_ALL_AVAILABLE_BOOKS -> libraryService.findAllAvabileBooks().forEach(System.out::println);
                case PRINT_ALL_NOT_AVAILABLE_BOOKS -> libraryService.findAllRentBooks().forEach(System.out::println);

            }

        } while (options != Options.EXIT);

    }


    private void printOptions() {
        System.out.println("Wybierz opcje");
        for (Options option : Options.values()
        ) {
            System.out.println(option);

        }
    }

    private LibraryDto addBook() {

        System.out.println("Podaj nazwe ksiazki");
        String bookName = scanner.next();
        System.out.println("Podaj Autora");
        String author = scanner.next();
        System.out.println("Podaj ilosc stron");
        int pagesNumber = scanner.nextInt();
        System.out.println("Podaj kategorie");
        String category = scanner.next();
        System.out.println("Podaj numer ISBN");
        int isbn = scanner.nextInt();
        return new LibraryDto(bookName, author, pagesNumber, category, isbn);
    }




    private long id() {
        System.out.println("Podaj nr porzadkowy ksiazki");
        long id = scanner.nextLong();
        return id;
    }

    private String firstName() {
        System.out.println("Podaj Imie wyporzyczajacego");
        String firstName = scanner.next();
        return firstName;
    }

    private String lastName() {
        System.out.println("Podaj nazwisko wyporzyczajacego");
        String lastName = scanner.next();
        return lastName;

    }

    String documentNumber() {
        System.out.println("Podaj  serie i  numer dowodu wyporzyczajacego");
        String documentNumber = scanner.next();
        return documentNumber;
    }

    private int dayOfRent() {
        System.out.println("Podaj ilosc dni wyporzyczenie");
        int dayOfRent = scanner.nextInt();
        return dayOfRent;


    }
    private void exit(){
        System.out.println("By by");
    }
}