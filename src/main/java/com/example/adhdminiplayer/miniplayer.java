package com.example.adhdminiplayer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.security.MessageDigest;

public class MiniPlayer extends Application {

    private double xOffset = 0;
    private double yOffset = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setOpacity(0.8);


        Group root = new Group();
        Scene scene = new Scene(root, Color.ORANGE);

        scene.setOnMousePressed(this::onMousePressed);
        scene.setOnMouseDragged(this::onMouseDragged);
        scene.setOnMouseEntered(this::onMouseEntered);
        scene.setOnMouseExited(this::onMouseExited);

        stage.setTitle("deez nutz");
        stage.setWidth(420);
        stage.setHeight(210);
        stage.setX(50);
        stage.setY(50);



        stage.setScene(scene);
        stage.show();
    }

    private void onMousePressed(MouseEvent event) {
        xOffset = event.getSceneX();
        yOffset = event.getSceneY();
    }

    private void onMouseDragged(MouseEvent event) {
        Stage stage = (Stage) ((Scene) event.getSource()).getWindow();
        stage.setX(event.getScreenX() - xOffset);
        stage.setY(event.getScreenY() - yOffset);
    }

    private void onMouseEntered(MouseEvent event) {
        Stage stage = (Stage) ((Scene) event.getSource()).getWindow();
        stage.setOpacity(0.4);
    }

    private void onMouseExited(MouseEvent event) {
        Stage stage = (Stage) ((Scene) event.getSource()).getWindow();
        stage.setOpacity(0.8);
    }
}
