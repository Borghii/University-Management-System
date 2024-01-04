package com.example.universitymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController {


    @FXML
    TextField fieldName;
    @FXML
    TextField fieldPassword;

    @FXML
    public void onSignIn(){
        if (verifyAdministrator(fieldName.getText(),fieldPassword.getText())) {

            MenuController mc = new MenuController();

            mc.closeCurrentStage(fieldName);
            mc.openNewStage("viewAdministrator.fxml");
        }


    }

    public boolean verifyAdministrator(String admin, String pass){
        return admin.equals("admin") && pass.equals("1234");
    }




}