module com.example.assignment2w2023 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.assignment2w2023 to javafx.fxml;
    exports com.example.assignment2w2023;
}