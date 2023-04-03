package com.example.assignment2w2023;

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

import java.net.URL;
import java.util.ResourceBundle;

public class LibraryController implements Initializable {
    Library library = new Library();
    Book book = new Book(new Image(Book.class.getResourceAsStream("images/placeholder.png")), "", "", 0);

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
    private TextField priceField;

    @FXML
    private Label priceLabel;

    @FXML
    private TextField titleField;

    @FXML
    private Label titleLabel;

    @FXML
    void addBook(ActionEvent event) {
        int x;
        String title = titleField.getText();
        String author = authorField.getText();
        double price = Double.parseDouble(priceField.getText());
        book.setTitle(title);
        book.setAuthor(author);
        book.setPrice(price);
        library.addBook(book);
        //x = library.length;
        items.add(book.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        bookList.setItems(items);
        //set up an initial 3 books
        book.setImage(new Image(Book.class.getResourceAsStream("images/manAfterMan.png")));
        book.setTitle("Man After Man");
        book.setAuthor("Dougal Dixon");
        book.setPrice(55.78);
        library.addBook(book);
        items.add(book.toString());
        book.setImage(new Image(Book.class.getResourceAsStream("images/dunwichHorror.png")));
        book.setTitle("The Dunwich Horror");
        book.setAuthor("H.P. Lovecraft");
        book.setPrice(10.43);
        library.addBook(book);
        items.add(book.toString());
        book.setImage(new Image(Book.class.getResourceAsStream("images/shadowInnsmouth.png")));
        book.setTitle("The Shadow Over Innsmouth");
        book.setAuthor("H.P. Lovecraft");
        book.setPrice(12.58);
        library.addBook(book);
        items.add(book.toString());
        bookList.setItems(items);

    }
}
