package com.example.library_spring_h2;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import java.time.LocalDate;


@Entity
public class Library {
    private String bookName;
    private String Author;
    private int numberOfPages;
    private String category;
    @Id
    private int isbn;
    private String firstName;
    private String lastName;
    private String id;

    public LocalDate getDateOfReturn() {
        return dateOfReturn;
    }

    public void setDateOfReturn(LocalDate dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    private LocalDate dateOfReturn;

    public Library() {
    }

    public Library(String bookName, String author, int numberOfPages, String category, int isbn) {
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookName='" + bookName + '\'' +
                ", Author='" + Author + '\'' +
                ", numberOfPages='" + numberOfPages + '\'' +
                ", category='" + category + '\'' +
                ", isbn=" + isbn +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
