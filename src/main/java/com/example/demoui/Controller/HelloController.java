package com.example.demoui.Controller;

import com.example.demoui.RootView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;


public class HelloController {

    @FXML
    private Label text;
    @FXML
    private TextField textField;
    @FXML
    private PasswordField passField;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {
     /*
        String s = textField.getText();
        String s1 = passField.getText();
        if (!(s.equals() && s1.equals())) {
            text.setText("Sorry! Please try again!");
        }
     */
        new RootView();
    }

    @FXML
    protected void onExitButtonClick() {System.exit(0);}
}