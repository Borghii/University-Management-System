package com.example.universitymanagementsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    TextField fieldName;
    @FXML
    TextField fieldPassword;

    @FXML
    public void onSignIn(){
        System.out.println(fieldName.getText());
    }


}