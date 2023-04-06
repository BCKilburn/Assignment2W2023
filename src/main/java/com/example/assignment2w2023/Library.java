package com.example.assignment2w2023;

import java.util.ArrayList;
import java.util.List;

public class Library {

    int index;
    String output;
    private ArrayList<Book> library;

    public Library() {
        library = new ArrayList<>();
    }

    public void addBook(Book book){
        library.add(book);
    }

    public List<Book> getLibrary(){
        return library;
    }

    public Book getBook(int index){
        return library.get(index);
    }
}
