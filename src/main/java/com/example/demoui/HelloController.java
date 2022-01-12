package com.example.demoui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class HelloController {
    Person testBasaPass = new Person();

    @FXML
    private Label text;
    @FXML
    private TextField textField;
    @FXML
    private PasswordField passField;

    @FXML
    protected void onHelloButtonClick(ActionEvent event) {
        String s = textField.getText();
        String s1 = passField.getText();
        if (!(s.equals(testBasaPass.log) && s1.equals(testBasaPass.pass))) {
            text.setText("Sorry! Please try again!");
        }
    }

    @FXML
    protected void onExitButtonClick() {System.exit(0);}
}