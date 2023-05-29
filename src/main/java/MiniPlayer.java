import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;

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

        String videoPath = "surf.mp4"; // Change this if your video file has a different name

        // Create a Media object with the video file path
        Media media = new Media(new File("surf.mp4").toURI().toString());

        // Create a MediaPlayer to play the video
        MediaPlayer mediaPlayer = new MediaPlayer(media);

        mediaPlayer.play();

        // Create a MediaView to display the video
        MediaView mediaView = new MediaView(mediaPlayer);

        // Bind the size of the MediaView to the size of the stage
        mediaView.fitWidthProperty().bind(stage.widthProperty());
        mediaView.fitHeightProperty().bind(stage.heightProperty());


        // Create a layout container to hold the MediaView
        StackPane root = new StackPane(mediaView);


        // Group root = new Group();
        Scene scene = new Scene(root, Color.BLACK);

        scene.setOnMousePressed(this::onMousePressed);
        scene.setOnMouseDragged(this::onMouseDragged);
        scene.setOnMouseEntered(this::onMouseEntered);
        scene.setOnMouseExited(this::onMouseExited);

        stage.setTitle("deez nutz");
        stage.setWidth(420);
        stage.setHeight(236);
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
