package com.example.assignment2w2023;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.List;

public class Library {
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

}
