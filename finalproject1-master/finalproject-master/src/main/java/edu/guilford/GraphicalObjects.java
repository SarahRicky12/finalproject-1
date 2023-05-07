package edu.guilford;

import javafx.scene.image.ImageView;

public abstract class GraphicalObjects {
    
    protected int xPosition;
    protected int yPosition;

    //abstract method for transitioning the object
    public abstract void transition(ImageView image);


    


}
