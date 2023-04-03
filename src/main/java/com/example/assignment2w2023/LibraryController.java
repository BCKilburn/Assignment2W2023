package com.example.assignment2w2023;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class LibraryController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}