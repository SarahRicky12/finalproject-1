package edu.guilford;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;

public class SeaCreatures extends GraphicalObjects {

    private int points; // points for catching the creature
    private int cycles; // number of cycles for the creature
    private String name; // name of the creature
    private ImageView image; // image of the creature
    private String mode = "easy"; // game mode (easy, medium, hard)
    private TranslateTransition transition; // transition for the creature
    Random random1 = new Random();
    ArrayList<SeaCreatures> caught = new ArrayList<SeaCreatures>(); // array list of caught sea creatures

    public SeaCreatures(String name, String mode) {
        this.name = name;
        // set the points for the sea creature
        if (name == "Large Fish") {
            if (mode == "easy") {
                points = 20;
            } else if (mode == "medium") {
                points = 30;
            } else if (mode == "hard") {
                points = 40;
            }
        } else if (name == "Large Fish 2") {
            if (mode == "easy") {
                points = 20;
            } else if (mode == "medium") {
                points = 30;
            } else if (mode == "hard") {
                points = 40;
            }

        } else if (name == "Small Fish") {
            if (mode == "easy") {
                points = 10;
            } else if (mode == "medium") {
                points = 20;
            } else if (mode == "hard") {
                points = 30;
            }
        } else if (name == "Small Fish 2") {
            if (mode == "easy") {
                points = 10;
            } else if (mode == "medium") {
                points = 20;
            } else if (mode == "hard") {
                points = 30;
            }
        } else if (name == "Small Fish 3") {
            if (mode == "easy") {
                points = 10;
            } else if (mode == "medium") {
                points = 20;
            } else if (mode == "hard") {
                points = 30;
            }
        } else if (name == "Wooden Stick") {
            if (mode == "easy") {
                points = -10;
            } else if (mode == "medium") {
                points = -20;
            } else if (mode == "hard") {
                points = -30;
            }
        } else if (name == "Octopus") {
            if (mode == "easy") {
                points = 30;
            } else if (mode == "medium") {
                points = 40;
            } else if (mode == "hard") {
                points = 50;
            }
        }
    }

    // constructor, where sea creature is either Big Fish, Small Fish, Wooden Stick,
    // or Octopus
    // if sea creature is Big Fish, then points = 20 and name = "Big Fish". If sea
    // creature is Small Fish, then points = 10 and name = "Small Fish."
    // If sea creature is Wooden Stick, then points = -5 and name = "Wooden Stick."
    // If sea creature is Octopus, then points = -20 and name = "Octopus."
    // constructor that takes in the points and name of the sea creature
    public SeaCreatures() {
        super();
        // array of sea creatures
        String[] seaCreatures = { "Large Fish", "Large Fish 2", "Small Fish", "Small Fish 2", "Small Fish 3",
                "Wooden Stick", "Octopus" };
        // math.random to randomly select a sea creature from the array
        int random = (int) (Math.random() * seaCreatures.length);
        // so if we ever get to modes, then we'd have to set all creatures in the list,
        // once the user hits a certain amount of points, to
        // be the same as the mode they're in;
        // switch statement to set the points and name of the sea creature
        switch (seaCreatures[random]) {
            case "Large Fish":
                if (mode == "easy") {
                    points = 20;
                } else if (mode == "medium") {
                    points = 30;
                } else if (mode == "hard") {
                    points = 40;
                }
                name = "Large Fish";
                // set the y position to be between 500 and 600 using random generator
                xPosition = 900;
                yPosition = random1.nextInt(100) + 600;
                image = new ImageView(
                        new File(this.getClass().getResource("largefish.png").getPath()).toURI().toString());
                image.setVisible(true);
                break;
            case "Large Fish 2":
                if (mode == "easy") {
                    points = 20;
                } else if (mode == "medium") {
                    points = 30;
                } else if (mode == "hard") {
                    points = 40;
                }
                name = "Large Fish 2";
                xPosition = 900;
                yPosition = random1.nextInt(100) + 600;
                image = new ImageView(
                        new File(this.getClass().getResource("largefish_2.png").getPath()).toURI().toString());
                image.setVisible(true);
                break;
            case "Small Fish":
                if (mode == "easy") {
                    points = 10;
                } else if (mode == "medium") {
                    points = 20;
                } else if (mode == "hard") {
                    points = 30;
                }
                name = "Small Fish";
                xPosition = 900;
                yPosition = random1.nextInt(100) + 400;
                image = new ImageView(
                        new File(this.getClass().getResource("smallfish.png").getPath()).toURI().toString());
                image.setVisible(true);
                break;
            case "Small Fish 2":
                if (mode == "easy") {
                    points = 10;
                } else if (mode == "medium") {
                    points = 20;
                } else if (mode == "hard") {
                    points = 30;
                }
                name = "Small Fish 2";
                xPosition = 900;
                yPosition = random1.nextInt(100) + 400;
                image = new ImageView(
                        new File(this.getClass().getResource("smallfish_2.png").getPath()).toURI().toString());
                image.setVisible(true);
                break;
            case "Small Fish 3":
                if (mode == "easy") {
                    points = 10;
                } else if (mode == "medium") {
                    points = 20;
                } else if (mode == "hard") {
                    points = 30;
                }
                name = "Small Fish 3";
                xPosition = 900;
                yPosition = random1.nextInt(100) + 400;
                image = new ImageView(
                        new File(this.getClass().getResource("smallfish_3.png").getPath()).toURI().toString());
                image.setVisible(true);
                break;
            case "Wooden Stick":
                if (mode == "easy") {
                    points = -10;
                } else if (mode == "medium") {
                    points = -20;
                } else if (mode == "hard") {
                    points = -30;
                }
                name = "Wooden Stick";
                xPosition = 900;
                yPosition = random1.nextInt(100) + 500;
                image = new ImageView(
                        new File(this.getClass().getResource("woodenstick.png").getPath()).toURI().toString());
                image.setVisible(true);
                break;
            case "Octopus":
                if (mode == "easy") {
                    points = 30;
                } else if (mode == "medium") {
                    points = 40;
                } else if (mode == "hard") {
                    points = 50;
                }
                name = "Octopus";
                xPosition = 900;
                yPosition = random1.nextInt(100) + 700;
                image = new ImageView(
                        new File(this.getClass().getResource("octopus.png").getPath()).toURI().toString());
                image.setVisible(true);
                break;
        }

    }

    // getters and setters
    public int getPoints() {
        return points;
    }

    public String getName() {
        return name;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TranslateTransition getTransition() {
        return transition;
    }

    public void setTransition(TranslateTransition transition) {
        this.transition = transition;
    }

    // getters and setters for the cycle
    public int getCycles() {
        return cycles;
    }

    public void setCycles(int cycles) {
        this.cycles = cycles;
    }

    // toString method with xPosition and yPosition and image name
    @Override
    public String toString() {
        return "SeaCreatures [image=" + image + ", name=" + name + ", points=" + points + ", xPosition=" + xPosition
                + ", yPosition=" + yPosition + "]";
    }

    // transition method
    @Override
    public void transition(ImageView image) {
        cycles = 1500;
        // delay should be between 3 and 150 seconds
        int delay = random1.nextInt(147) + 3;
        // so it would be object.transition(object.transition(getImage))
        // if the sea creature is a large fish
        if (name.equals("Large Fish")) {
            TranslateTransition largeFishTransition = new TranslateTransition();
            largeFishTransition.setNode(image);
            largeFishTransition.setDuration(javafx.util.Duration.seconds(random1.nextInt(5) + 10));
            largeFishTransition.setByX(-1000);
            // setDelay, randomize delay between 1 and 10 seconds
            largeFishTransition.setDelay(javafx.util.Duration.seconds(delay));
            largeFishTransition.setCycleCount(cycles);
            largeFishTransition.play();
            image.setY(yPosition);
            image.setX(xPosition);
            // set visible to true
            image.setVisible(true);
            // set transition variable to largeFishTransition
            transition = largeFishTransition;

            // if the sea creature is a large fish 2
        } else if (name.equals("Large Fish 2")) {
            TranslateTransition largeFish2Transition = new TranslateTransition();
            largeFish2Transition.setNode(image);
            largeFish2Transition.setDuration(javafx.util.Duration.seconds(random1.nextInt(5) + 10));
            largeFish2Transition.setByX(-1000);
            // set delay
            largeFish2Transition.setDelay(javafx.util.Duration.seconds(delay));
            largeFish2Transition.setCycleCount(cycles);
            largeFish2Transition.play();
            image.setY(yPosition);
            image.setX(xPosition);
            image.setVisible(true);
            transition = largeFish2Transition;
        }
        // if the sea creature is a small fish
        else if (name.equals("Small Fish")) {
            TranslateTransition smallFishTransition = new TranslateTransition();
            smallFishTransition.setNode(image);
            smallFishTransition.setDuration(javafx.util.Duration.seconds(random1.nextInt(5) + 10));
            smallFishTransition.setByX(-1000);
            // set delay
            smallFishTransition.setDelay(javafx.util.Duration.seconds(delay));
            smallFishTransition.setCycleCount(cycles);
            smallFishTransition.play();
            image.setY(yPosition);
            image.setX(xPosition);
            image.setVisible(true);
            transition = smallFishTransition;
        }
        // if the sea creature is a small fish 2
        else if (name.equals("Small Fish 2")) {
            TranslateTransition smallFish2Transition = new TranslateTransition();
            smallFish2Transition.setNode(image);
            smallFish2Transition.setDuration(javafx.util.Duration.seconds(random1.nextInt(5) + 10));
            smallFish2Transition.setByX(-1000);
            // set delay
            smallFish2Transition.setDelay(javafx.util.Duration.seconds(delay));
            smallFish2Transition.setCycleCount(cycles);
            smallFish2Transition.play();
            image.setY(yPosition);
            image.setX(xPosition);
            image.setVisible(true);
            transition = smallFish2Transition;
        }
        // if the sea creature is a small fish 3
        else if (name.equals("Small Fish 3")) {
            TranslateTransition smallFish3Transition = new TranslateTransition();
            smallFish3Transition.setNode(image);
            smallFish3Transition.setDuration(javafx.util.Duration.seconds(random1.nextInt(5) + 10));
            smallFish3Transition.setByX(-1000);
            // set delay
            smallFish3Transition.setDelay(javafx.util.Duration.seconds(delay));
            smallFish3Transition.setCycleCount(cycles);
            smallFish3Transition.play();
            image.setY(yPosition);
            image.setX(xPosition);
            image.setVisible(true);
            transition = smallFish3Transition;
        }
        // if the sea creature is a wooden stick
        else if (name.equals("Wooden Stick")) {
            TranslateTransition woodenStickTransition = new TranslateTransition();
            woodenStickTransition.setNode(image);
            woodenStickTransition.setDuration(javafx.util.Duration.seconds(random1.nextInt(5) + 10));
            woodenStickTransition.setByX(-1000);
            // set delay
            woodenStickTransition.setDelay(javafx.util.Duration.seconds(delay));
            woodenStickTransition.setCycleCount(cycles);
            woodenStickTransition.play();
            image.setY(yPosition);
            image.setX(xPosition);
            image.setVisible(true);
            transition = woodenStickTransition;
            RotateTransition rotate = new RotateTransition();
            rotate.setNode(image);
            rotate.setDuration(javafx.util.Duration.seconds(15));
            rotate.setByAngle(360);
            rotate.setCycleCount(Animation.INDEFINITE);
            rotate.play();
        }
        // if the sea creature is an octopus
        else if (name.equals("Octopus")) {
            TranslateTransition octopusTransition = new TranslateTransition();
            octopusTransition.setNode(image);
            octopusTransition.setDuration(javafx.util.Duration.seconds(random1.nextInt(20) + 20));
            octopusTransition.setByX(-1200);
            // set delay
            octopusTransition.setDelay(javafx.util.Duration.seconds(delay));
            octopusTransition.setCycleCount(cycles);
            octopusTransition.play();
            image.setY(yPosition);
            image.setX(xPosition);
            image.setVisible(true);
            transition = octopusTransition;
        }

    }

}
