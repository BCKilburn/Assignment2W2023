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
        title = title.trim();
        if(title.length() < 2 || title.charAt(0) == ' '){
            throw new IllegalArgumentException("Title must be more than 2 letters and cannot begin with a blank space.");
        } else if (title.isBlank()) {
            throw new IllegalArgumentException("Title field cannot be blank");
        }

        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author.trim();
        if(author.length() < 1 || author.charAt(0) == ' '){
            throw new IllegalArgumentException("Author's name must be greater than one letter and not begin with a blank space.");
        } else if (author.isBlank()) {
            throw new IllegalArgumentException("Author field cannot be blank");
        }
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price < 0.001 || price > 99999.99){
            throw new IllegalArgumentException("Price is either too low or too high, must be between 0.001 and 99999.99");
        } else if (Double.isNaN(price)) {
            throw new IllegalArgumentException("Must be a number");
        }
        this.price = price;
    }

    public String toString(){
        return title + "-" + author;
    }
}
