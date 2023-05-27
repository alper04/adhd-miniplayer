package com.example.adhdminiplayer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class miniController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}