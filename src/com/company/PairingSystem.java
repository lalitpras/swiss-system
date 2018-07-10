package com.company;

import java.util.List;
import java.util.ArrayList;

public class PairingSystem {
    private List<Player> playerList = new ArrayList<Player>();

    public List<Player> getPlayerList() {
        for (int i = 0; i < playerList.size(); i++) {
            System.out.println(playerList.get(i).getPlayerName());
        }
        return playerList;
    }

    public void addPlayer(Player player) {
        playerList.add(player);
    }
}
