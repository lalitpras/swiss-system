package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private List<Player> previousOpponents = new ArrayList<>();
    private List<Colour> previousColours = new ArrayList<>();
    private float score;
    private String playerName;

    public Player(String playerName) {
        this.playerName = playerName;
    }


    public float getScore() {
        return score;
    }

    public List<Colour> getPreviousColours() {
        return previousColours;
    }

    public List<Player> getPreviousOpponents() {
        return previousOpponents;
    }

    public void addOpponent(Player player) {
        previousOpponents.add(player);
    }

    public void addColour(Colour colour) {
        previousColours.add(colour);
    }

    public void updateScore(Result result) {
        if (result.equals(Result.WIN)) {
            score = score + 1;
        } else if (result.equals(Result.DRAW)) {
            score = score + 1/2;
        } else if (result.equals(Result.LOSS)) {

        } else {
            System.out.println("Invalid result");
        }
    }

    public String getPlayerName() {
        return playerName;
    }
}
