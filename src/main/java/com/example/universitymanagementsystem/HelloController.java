package com.example.universitymanagementsystem;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;


    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Su nombre es: "+nombre.getText()+" " +apellido.getText());
    }



}