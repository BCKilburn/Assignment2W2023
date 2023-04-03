package com.example.assignment2w2023;

import javafx.scene.image.Image;

public class Book {
    private Image image;

    protected String title, author;

    protected double price;

    public Book(Image image, String title, String author, double price) {
        this.image = image;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    protected String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString(){
        return title + "-" + author;
    }
}
