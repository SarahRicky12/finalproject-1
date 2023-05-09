package edu.guilford;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.util.Duration;

public class FishingLine extends GraphicalObjects {
    int endingX;
    int endingY;
    Line line;
    Timeline lineTransition;
    Timeline circleTransition;

    // constructor
    public FishingLine() {
        super();
        xPosition = 339;
        yPosition = 183;
        endingX = 317;
        endingY = 827;
        line = new Line(xPosition, yPosition, endingX, endingY);
        // set line color
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

        // use path transition to have the circle follow the end of the line

        // Circle circle = new Circle(line.getEndX(), line.getEndY(), 5);
        // circle.setVisible(true);
        // PathTransition pathTransition = new PathTransition();
        // path.getElements().add(new MoveTo(339, 183));
        // path.getElements().add(new MoveTo(317, 827));
        // pathTransition.setDuration(Duration.seconds(7));
        // pathTransition.setNode(line);
        // pathTransition.setPath(path);
        // pathTransition.setCycleCount(1);
        // pathTransition.play();

        // //add a circle to the end of the line with parameters(circle center x, circle
        // center y, radius)
        // Circle circle = new Circle(line.getEndX(), line.getEndY(), 5);
        // //create a timeline for the circle
        // circleTransition = new Timeline();
        // circleTransition.getKeyFrames()
        // .add(new KeyFrame(Duration.seconds(7),
        // new KeyValue(circle.centerXProperty(), 339),
        // new KeyValue(circle.centerYProperty(), 183)));

        // circleTransition.setCycleCount(1);
        // circleTransition.play();
    }

    // moving line back and forth to catch fish with it being attached to the boat
    // means having the line starting point connected to the pixel of the fishing
    // rod, end point being with the slope of the line

    public void transitionLineDownward() {
        // add a circle to the end of the line
        Circle circle = new Circle(317, 827, 5);
        lineTransition = new Timeline();
        lineTransition.getKeyFrames()
                .add(new KeyFrame(Duration.seconds(7),
                        new KeyValue(line.endXProperty(), 317),
                        new KeyValue(line.endYProperty(), 827)));

        // have the circle follow the line
        lineTransition.getKeyFrames()
                .add(new KeyFrame(Duration.seconds(7),
                        new KeyValue(circle.centerXProperty(), 339),
                        new KeyValue(circle.centerYProperty(), 183)));
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