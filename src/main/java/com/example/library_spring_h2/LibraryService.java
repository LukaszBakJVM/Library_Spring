package com.example.library_spring_h2;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
@Service

public class LibraryService {
    private final LibraryRepo libraryRepo;

    public LibraryService(LibraryRepo libraryRepo) {
        this.libraryRepo = libraryRepo;
    }
    @Transactional
    public void  addNewBook(LibraryDto libraryDto){
        Library library =new Library(libraryDto.getBookName()
        ,libraryDto.getAuthor(),libraryDto.getNumberOfPages(),
                libraryDto.getCategory(), libraryDto.getIsbn());
        libraryRepo.save(library);
    }
@Transactional
    public void delte(int isbn){
        libraryRepo.remove(isbn);
    }
@Transactional
    public Library rent(int isbn, int day, String firstName, String lastName, String id) {
Library library =libraryRepo.findBookByIsbn(isbn).orElseThrow(NotFoudBookExeption::new);
LocalDate localDate =LocalDate.now();

library.setDateOfReturn(localDate.plusDays(day));
library.setFirstName(firstName);
library.setLastName(lastName);
library.setId(id);
return library;
    }
@Transactional
    public void  returnBook(int isbn){
        Library library =libraryRepo.findBookByIsbn(isbn).orElseThrow(NotFoudBookExeption::new);
        library.setDateOfReturn(null);
        library.setFirstName(null);
        library.setLastName(null);
        library.setId(null);

    }

}
