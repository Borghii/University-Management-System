package com.example.universitymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.HashMap;

public class AdministratorController {

    MenuController mc = new MenuController();

    @FXML
    Button buttonBack;
    @FXML
    Button addStudent;
    @FXML
    Button addProfessor;
    @FXML
    Button addCourse;


    @FXML
    private void onBack(){
        mc.closeCurrentStage(buttonBack);
        mc.openNewStage("viewLogin.fxml");
    }

    @FXML
    public void addStudent(){

    }



}