package com.example.library_spring_h2;

public enum Options {
    EXIT(0,"Wyjscie"),ADD(1,"Dodaj ksiazke"),RENT(2,"Wyporzycz ksiazke"),DELETE_BOOK(3,"Usun ksiazke");
    final private int option;
    final private String descryption;

    Options(int option, String descryption) {
        this.option = option;
        this.descryption = descryption;
    }

    @Override
    public String toString() {
        return option +"-->"+
                descryption ;
    }

    public static Options createOptions(int opt){
        return Options.values()[opt];
    }
}
