package com.company;

import java.util.List;
import java.util.ArrayList;

public class PairingSystem {
    private List<Player> playerList = new ArrayList<Player>();
    private List<List<Pairing>> roundsPairings = new ArrayList<List<Pairing>>();

    public List<Player> getPlayerList() {
        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(playerList.get(i).getPlayerName());
        }
        return playerList;
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }

    public List<Pairing> setPairingsForRound(int roundNumber) {
        Pairing currentPairing = new Pairing();
        for (int i = 0; i< playerList.size(); i = i+2) {
            currentPairing.setPlayer1(playerList.get(i));
            currentPairing.setPlayer2(playerList.get(i+1));
            roundsPairings.get(roundNumber - 1).add(currentPairing);
        }
        return roundsPairings.get(roundNumber);
    }
}
