module fr.eseo.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.eseo.demo to javafx.fxml;
    exports fr.eseo.demo;
}