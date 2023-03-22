module com.daw.Practica1Maven {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.daw.Practica1Maven to javafx.fxml;
    exports com.daw.Practica1Maven;
}
