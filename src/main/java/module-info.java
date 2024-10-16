module fr.eseo.projet_gaia {
    requires javafx.controls;
    requires javafx.fxml;


    opens fr.eseo.projet_gaia to javafx.fxml;
    exports fr.eseo.projet_gaia;
}