package com.example.universitymanagementsystem;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;

public class MenuController {

    public void closeCurrentStage(TextField textField) {
        Stage stage = (Stage) textField.getScene().getWindow();
        stage.close();
    }

    public void openNewStage(String fxmlFileName) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MenuController.class.getResource(fxmlFileName));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = new Stage();
            stage.setTitle("Admin");
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier excepción que pueda ocurrir al cargar el nuevo FXML
        }
    }
}
