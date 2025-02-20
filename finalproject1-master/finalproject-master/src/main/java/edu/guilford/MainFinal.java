package edu.guilford;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

/**
 * JavaFX App
 */

// extends Javafx Animation class
public class MainFinal extends Application {

    private static Scene scene;
    private static Scene key;

    @Override
    public void start(Stage PrimaryStage) throws IOException, URISyntaxException {
        // Instantiate the controller
        StackPane root = new StackPane();
        scene = new Scene(root, 900, 828);
        SeaCreatures seaCreature = new SeaCreatures();
        // set background image using the ocean.png file through the Image class and the
        // BackgroundImage class
        Image image = new Image(new File(MainFinal.class.getResource("ocean_2.png").getPath()).toURI().toString());
        // resize the image
        BackgroundImage backgroundImage = new BackgroundImage(image, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        // set the background image
        root.setBackground(new Background(backgroundImage));
        // root.getChildren().add(new FishingPane(seaCreature));

        PrimaryStage.setScene(scene);
        PrimaryStage.setTitle("Fishing Game");
        PrimaryStage.show();

        // make it so that the program stops when the window is closed
        PrimaryStage.setOnCloseRequest(e -> System.exit(0));

        // make the keyPane an anchorPane
        VBox keyPane = new VBox();
        StackPane overlap = new StackPane(keyPane);
        // add the keyPane to the scene
        // keyPane.getChildren().add(new KeyPane());
        // key = new Scene(overlap, 900, 828);
        // have pane not transparent
        keyPane.setOpacity(1);
        // overlap.setVisible(true);

        // make it so that keyPane is a separate window that can be opened and closed
        PrimaryStage.addEventHandler(KeyEvent.KEY_PRESSED, new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.K) {
                    Stage keyStage = new Stage();
                    keyStage.setScene(key);
                    keyStage.setTitle("Key");
                    keyStage.show();
                }
            }
        });
        root.getChildren().addAll(new FishingPane(seaCreature), new KeyPane());
    }

    public static void main(String[] args) {
        launch();
    }

}