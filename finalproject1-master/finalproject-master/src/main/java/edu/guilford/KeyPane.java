package edu.guilford;

import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

public class KeyPane extends Pane {
    
    SeaCreatures seaCreature = new SeaCreatures();

    private Label smallFishLabel;
    private Label largeFishLabel;
    private Label woodenStickLabel;
    private Label octopusLabel;

    public KeyPane() {
        //label to get points for the smallfish from the seacreature class
        SeaCreatures smallFish = new SeaCreatures("Small Fish", "easy");
        smallFishLabel = new Label("Small Fish: " + smallFish.getPoints() + " points");
        //label to get points for the largefish from the seacreature class
        SeaCreatures largeFish = new SeaCreatures("Large Fish", "easy");
        largeFishLabel = new Label("Large Fish: " + largeFish.getPoints() + " points");
        //label to get points for the woodenstick from the seacreature class
        SeaCreatures woodenStick = new SeaCreatures("Wooden Stick", "easy");
        woodenStickLabel = new Label("Wooden Stick: " + woodenStick.getPoints() + " points");
        //label to get points for the octopus from the seacreature class
        SeaCreatures octopus = new SeaCreatures("Octopus", "easy");
        octopusLabel = new Label("Octopus: " + octopus.getPoints() + " points");

        //set the layout of the labels
        smallFishLabel.setLayoutX(10);
        smallFishLabel.setLayoutY(10);
        largeFishLabel.setLayoutX(10);
        largeFishLabel.setLayoutY(30);
        woodenStickLabel.setLayoutX(10);
        woodenStickLabel.setLayoutY(50);
        octopusLabel.setLayoutX(10);
        octopusLabel.setLayoutY(70);
        this.getChildren().addAll(smallFishLabel, largeFishLabel, woodenStickLabel, octopusLabel);
    }

}
