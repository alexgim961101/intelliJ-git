module com.example.intellijgit {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.intellijgit to javafx.fxml;
    exports com.example.intellijgit;
}