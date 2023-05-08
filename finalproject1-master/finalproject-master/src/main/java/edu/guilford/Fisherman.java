package edu.guilford;

import java.io.File;

import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;

public class Fisherman extends GraphicalObjects {
    private ImageView image; 
    private TranslateTransition transition;

    public Fisherman(ImageView image, TranslateTransition transition) {
        this.image = image; 
        this.transition = transition; 
    }

    public Fisherman() {
        super();
        xPosition = 325;
        yPosition = 165;
        image = new ImageView(
            new File(FishingPane.class.getResource("fisherman.png").getPath()).toURI().toString());
        //remember to add the image to the pane
    }

    //getters and setters
    public ImageView getImage() {
        return image; 
    }

    public TranslateTransition getTransition() {
        return transition; 
    }

    public void setImage(ImageView image) {
        this.image = image; 
    }

    public void setTransition(TranslateTransition transition) {
        this.transition = transition; 
    }

    //get the x and y positions of the fisherman
    public int getXPosition() {
        return xPosition; 
    }

    public int getYPosition() {
        return yPosition; 
    }

    //method for transitioning the fisherman
    @Override
    public void transition(ImageView image) {
        transition = new TranslateTransition();
        transition.setNode(image);
        transition.setDuration(javafx.util.Duration.seconds(1));
        transition.setCycleCount(1);
        transition.setAutoReverse(false);
        transition.play();
    }

    public void setPosition(int x, int y) {
        image.setX(x);
        image.setY(y);
    }

}