package com.example.universitymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class AdministratorController {

    @FXML
    TextField fieldName;
    @FXML
    TextField fieldPassword;

    @FXML
    public void onSignIn(){
        System.out.println(fieldName.getText());
    }


}