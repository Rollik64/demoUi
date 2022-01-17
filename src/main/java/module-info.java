module com.example.demoui {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.example.demoui to javafx.fxml;
    exports com.example.demoui;
    exports com.example.demoui.DB;
    opens com.example.demoui.DB to javafx.fxml;
}