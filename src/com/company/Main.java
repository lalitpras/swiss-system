package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        PairingSystem pairingSystem = new PairingSystem();
//        Player p1 = new Player("p1");
//        Player p2 = new Player("p2");
//        pairingSystem.addPlayer(p1);
//        pairingSystem.addPlayer(p2);
//        pairingSystem.getPlayerList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter player names. Type \"done\" when finished");

        //input all players
        while (true) {
            String input = scanner.nextLine();

            if ("done".equals(input)) {
                break;
            } else {
                pairingSystem.addPlayer(new Player(input));
            }
        }

        pairingSystem.getPlayerList();
    }
}
