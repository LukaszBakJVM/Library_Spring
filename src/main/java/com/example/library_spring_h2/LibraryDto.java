package com.example.library_spring_h2;



public class LibraryDto {

    private long id;

    private String bookName;
    private String author;
    private int numberOfPages;
    private String category;

    private int isbn;

    public LibraryDto(long id, String bookName, String author, int numberOfPages, String category, int isbn) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.category = category;
        this.isbn = isbn;

    }
    public LibraryDto(String bookName, String author, int numberOfPages, String category, int isbn) {
        this.id=id;
        this.bookName = bookName;
        this.author=author;
        this.numberOfPages = numberOfPages;
        this.category = category;
        this.isbn = isbn;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author;
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

    @Override
    public String toString() {

        return "Nr porzadkowy: " +id+  "  Tytul: " + bookName +
                "  Autor: " + author +
                "  Ilosc stron: " + numberOfPages +
                "  kategoria: " + category +
                "  ISBN: "+ isbn ;
    }
}
