module org.example.primenumbers {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.primenumbers to javafx.fxml;
    exports org.example.primenumbers;
}