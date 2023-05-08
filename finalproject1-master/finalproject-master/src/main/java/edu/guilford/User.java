package edu.guilford;

public class User extends SeaCreatures {
    private String name;
    private String password;
    private int score;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.score = 0;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    //we would have to create an arraylist with all the fish the user has caught and then have a for loop
    //that goes through the arraylist and adds the points of each fish to the user's score. 



}