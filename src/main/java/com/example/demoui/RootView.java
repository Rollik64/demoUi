package com.example.demoui;

import com.example.demoui.Controller.HelloController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RootView {


    public RootView() throws IOException {
        Stage primaryStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(RootView.class.getResource("root-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 450);
        scene.getStylesheets().add(0, "my.css");
        primaryStage.setTitle("Rucombiconⓟ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
