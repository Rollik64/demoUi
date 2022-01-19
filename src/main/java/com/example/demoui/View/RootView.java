package com.example.demoui.View;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RootView extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RootView.class.getResource("root-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 560, 320);
        scene.getStylesheets().add(0, "my.css");
        primaryStage.setTitle("Rucombiconⓟ");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
