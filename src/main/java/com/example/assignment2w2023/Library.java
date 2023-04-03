package com.example.assignment2w2023;

import java.util.ArrayList;
import java.util.List;

public class Library {
    int index;
    private ArrayList<Book> library;

    public Library(ArrayList<Book> library) {
        library = new ArrayList<Book>();
    }

    public void addBook(Book book){
        library.add(book);
    }

    public List<Book> getLibrary(){
        return library;
    }
}
