package com.example.library_spring_h2;

import jakarta.persistence.Id;

public class LibraryDto {

    private String bookName;
    private String Author;
    private int numberOfPages;
    private String category;

    private int isbn;

    public LibraryDto(String bookName, String author, int numberOfPages, String category, int isbn) {
        this.bookName = bookName;
        Author = author;
        this.numberOfPages = numberOfPages;
        this.category = category;
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
