package com.example.adhdminiplayer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;

public class VideoPlayerApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create the Media object with the path to your video file
        String videoPath = "http://download.oracle.com/otndocs/products/javafx/oow2010-2.flv";
        Media media = new Media(videoPath);

        // Create the MediaPlayer object
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        // Create the MediaView to display the video
        MediaView mediaView = new MediaView(mediaPlayer);

        // Create the layout
        StackPane root = new StackPane();
        root.getChildren().add(mediaView);

        // Create the Scene
        Scene scene = new Scene(root, 800, 600);

        // Set the stage properties
        primaryStage.setTitle("Video Player");
        primaryStage.setScene(scene);
        primaryStage.show();

        // Play the video
        mediaPlayer.play();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
