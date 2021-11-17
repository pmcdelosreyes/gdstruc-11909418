package com.pierrematthews;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayQueue matchMaking = new ArrayQueue(7);
        int games = 0;
        System.out.println("Welcome to Valorant! Press any key to continue.");
        new Scanner(System.in).nextLine();

        while (games < 10) {
            inputPlayers(matchMaking);

            if(matchMaking.size() >= 5){
                System.out.println("Match found!\n");
                startGame(matchMaking);
                games++;
                System.out.println("Games: "+ games);
            }
            else {
                System.out.println("Not enough players!");
            }
            System.out.println("Go next! Press any key!");
            new Scanner(System.in).nextLine();
        }
        System.out.println("Games are complete! GGs!");
    }

    public static ArrayQueue inputPlayers(ArrayQueue playerQueue){
        String agentName[] = {"Phoenix", "Jett", "Raze", "Sage", "Skye", "Yoru",
                "Brimstone", "Reyna", "Breach", "Sova", "Viper", "Cypher"};
        int nameIndex, playerCount, level;
        Random rand = new Random();
        Player head = null;
        if (playerQueue.size() != 0)
        {
            playerCount = 1 + rand.nextInt(7-playerQueue.size());
        }
        else
        {
            playerCount = 1 + rand.nextInt(7); //determines how many players are logged in.
        }

        System.out.println(playerCount + " Agent/s found!");
        for (int i = 0; i < playerCount; i++){
            nameIndex = rand.nextInt(10);
            level = 1 + rand.nextInt(10);
            head = new Player(agentName[nameIndex], level);
            playerQueue.add(head);
        }
        playerQueue.printQueue();
        System.out.println("\nCurrent players: "+ playerQueue.size());
        return playerQueue;
    }

    public static void startGame(ArrayQueue playerQueue)
    {
        for (int i = 0; i < 5; i++)
        {
            System.out.println(playerQueue.peek() + " has joined the match!");
            playerQueue.remove();
        }

        if (playerQueue.size() != 0)
        {
            System.out.println(playerQueue.size() + " other player/s remaining. Sending them to the shadow realm! (Next queue xD)");
        }
    }
}
