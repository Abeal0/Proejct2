module com.example.proejct2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proejct2 to javafx.fxml;
    exports com.example.proejct2;
}