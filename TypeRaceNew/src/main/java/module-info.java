module com.example.typeracenew {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.typeracenew to javafx.fxml;
    exports com.example.typeracenew;
}