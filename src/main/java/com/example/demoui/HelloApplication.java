package com.example.demoui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
//Пробую ГитХаб
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        scene.getStylesheets().add(0, "my.css");
        stage.setTitle("Rucombiconⓟ");
        stage.setScene(scene);
        stage.show();
    }
    // И тут пробую
    public static void main(String[] args) {
        launch();
    }
}