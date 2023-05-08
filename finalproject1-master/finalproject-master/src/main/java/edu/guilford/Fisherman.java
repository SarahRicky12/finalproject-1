package edu.guilford;

import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;

public class Fisherman extends GraphicalObjects {
    private ImageView image; 
    private TranslateTransition transition; 

    public Fisherman(ImageView image, TranslateTransition transition) {
        this.image = image; 
        this.transition = transition; 
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

    //method for transitioning the fisherman
    @Override
    public void transition(ImageView image) {
        transition.setNode(image);
        transition.setDuration(javafx.util.Duration.seconds(1));
        transition.setCycleCount(1);
        transition.setAutoReverse(false);
        transition.play();
    }

}