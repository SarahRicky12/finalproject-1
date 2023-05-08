package edu.guilford;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class FishingLine extends GraphicalObjects {
    int endingX;
    int endingY;
    Line line;
    Timeline lineTransition; 

    // constructor
    public FishingLine() {
        super();
        xPosition = 339;
        yPosition = 183;
        endingX = 317;
        endingY = 827;
        line = new Line(xPosition, yPosition, endingX, endingY);
        //set line color
        line.setStrokeWidth(2);
        line.setStroke(javafx.scene.paint.Color.BLACK);
    }

    // getters and setters
    public int getEndingX() {
        return endingX;
    }

    public int getEndingY() {
        return endingY;
    }

    public Line getLine() {
        return line;
    }

    public void setEndingX(int endingX) {
        this.endingX = endingX;
    }

    public void setEndingY(int endingY) {
        this.endingY = endingY;
    }

    public void setLine(Line line) {
        this.line = line;
    }


    // transition method inherited from GraphicalObjects
    @Override
    public void transition(ImageView image) {
        ;
    }

    public void transitionLineUpward() {
        lineTransition = new Timeline();
        lineTransition.getKeyFrames()
                .add(new KeyFrame(Duration.seconds(7),
                        new KeyValue(line.endXProperty(), 339),
                        new KeyValue(line.endYProperty(), 183)));
        lineTransition.setCycleCount(1);
        lineTransition.play();
    }

    public void transitionLineDownward() {
        lineTransition = new Timeline();
        lineTransition.getKeyFrames()
                .add(new KeyFrame(Duration.seconds(7),
                        new KeyValue(line.endXProperty(), 317),
                        new KeyValue(line.endYProperty(), 827)));
        lineTransition.setCycleCount(1);
        lineTransition.play();
    }

    // Timeline lineTransition2 = new Timeline();
    // line.setEndX(line.getStartX());
    // line.setEndY(line.getStartY());
    // lineTransition2.getKeyFrames()
    // .add(new KeyFrame(Duration.seconds(10),
    // new KeyValue(line.endXProperty(), 317),
    // new KeyValue(line.endYProperty(), 700)));
    // lineTransition2.setCycleCount(1);
    // lineTransition2.play();
}