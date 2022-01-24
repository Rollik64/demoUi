package com.example.demoui;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;

public class RootView {


    public RootView() throws IOException {
        Stage primaryStage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(RootView.class.getResource("root-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 720, 450);
        scene.getStylesheets().add(0, "hello.css");
        primaryStage.setTitle("Rucombiconⓟ");
        primaryStage.setScene(scene);

        File file = new File("C:\\Users\\Вадим\\Desktop\\photo_2021-12-30_11-15-02.jpg");
        String localUrl = file.toURI().toURL().toString();
        Image image = new Image(localUrl);

        primaryStage.show();
    }

}
