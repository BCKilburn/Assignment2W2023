package com.example.assignment2w2023;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class LibraryController implements Initializable {
    Library library = new Library();
    Book book = new Book(new Image(Book.class.getResourceAsStream("images/placeholder.png")), "", "", 0);

    Map<String, Book> listOfBooks = new HashMap<>();
    int count = 0;


    @FXML
    private Button addBtn;

    @FXML
    private TextField authorField;

    @FXML
    private Label authorLabel;

    @FXML
    private ListView<String> bookList;

    private ObservableList<String> items = FXCollections.observableArrayList();

    @FXML
    private ImageView display;

    @FXML
    private TextField priceField;

    @FXML
    private Label priceLabel;

    @FXML
    private TextField titleField;

    @FXML
    private Label titleLabel;

    @FXML
    void addBook(ActionEvent event) {
        String title = titleField.getText();
        String author = authorField.getText();
        double price = Double.parseDouble(priceField.getText());
        Book book = new Book(new Image(Book.class.getResourceAsStream("images/placeholder.png")), title , author, price);
        String name = "book" + count;
        listOfBooks.put(name, book);
        library.addBook(book);
        items.add(book.toString());
        count ++;
    }





    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bookList.setItems(items);
        //set up an initial 3 books
        Book book0 = new Book(new Image(Book.class.getResourceAsStream("images/manAfterMan.png")), "Man After Man", "Dougal Dixon", 55.78);
        library.addBook(book0);
        items.add(book0.toString());
        Book book1 = new Book(new Image(Book.class.getResourceAsStream("images/dunwichHorror.png")), "The Dunwich Horror", "H.P. Lovecraft", 10.43);
        library.addBook(book1);
        items.add(book1.toString());
        Book book2 = new Book (new Image(Book.class.getResourceAsStream("images/shadowInnsmouth.png")), "The Shadow Over Innsmouth", "H.P. Lovecraft", 12.58);
        library.addBook(book2);
        items.add(book2.toString());
        System.out.println(items);
        bookList.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) ->{
            if(newValue != null){
                int selectedBook = bookList.getSelectionModel().getSelectedIndex();
                Book z = library.getBook(selectedBook);
                System.out.println(library.getBook(selectedBook));
                System.out.println(selectedBook);
                String titleText = z.getTitle();
                String authorName = z.getAuthor();
                Double priceText = z.getPrice();
                display.setImage(z.getImage());
                titleLabel.setText(titleText);
                authorLabel.setText(authorName);
                priceLabel.setText("$" + priceText);

            }
        });
    }
}
