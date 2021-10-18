package com.pierrematthews;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static CardStack occupyDeck(CardStack originalDeck)
    {
        String suits [] = {"Spades", "Hearts", "Clubs", "Diamonds"};
        int cardSuit;
        Random rand = new Random();
        Card temp = null;
        for (int i = 0; i < 30; i++) {
            cardSuit = rand.nextInt(4);
            temp =  new Card(suits[cardSuit]);
            originalDeck.push(temp);
        }
        return originalDeck;
    }

    public static int quantityOfCards(int max)
    {
        Random rand = new Random();
        int amount = 1 + rand.nextInt(max);
        System.out.println("cards: +" + amount);
        return amount;
    }

    public static void drawCards(CardStack hand, CardStack originalDeck)
    {
        System.out.print("\nYou drew cards. You gained ");
        int amount;
        if(originalDeck.cardCheck() < 5) { amount = quantityOfCards(originalDeck.cardCheck());}
        else { amount = quantityOfCards(5);}
        Card temp = null;
        for (int i = 0; i < amount; i++) {
            temp = originalDeck.peek();
            hand.push(temp);
            originalDeck.pop();
        }
    }

    public static void discardCards(CardStack hand, CardStack discardPile)
    {
        System.out.print("\nYou discarded cards into the pile. You lost ");
        int amount = quantityOfCards(hand.cardCheck());
        Card temp = null;
        for (int i = 0; i < amount; i++) {
            temp = hand.peek();
            discardPile.push(temp);
            hand.pop();
        }
    }

    public static void regainCards(CardStack hand, CardStack discardPile)
    {
        System.out.print("\nYou regain cards from the discarded pile. You regained ");
        int amount = quantityOfCards(discardPile.cardCheck());
        Card temp = null;
        for (int i = 0; i < amount; i++) {
            temp = discardPile.peek();
            hand.push(temp);
            discardPile.pop();
        }
    }

    public static void printDecks(CardStack hand, CardStack originalDeck, CardStack discardPile)
    {
        System.out.println("\nThe cards in your hand are "); hand.printDeck();
        System.out.println("There are " + originalDeck.cardCheck() + " cards remaining in the deck and " +
                discardPile.cardCheck() + " cards remaining in the discarded pile.");
    }

    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int cardQ, rounds = 1; String answer;
        CardStack originalDeck = new CardStack(); occupyDeck(originalDeck);
        CardStack hand = new CardStack();
        CardStack discardPile = new CardStack();

        System.out.println("Hello User! Welcome to a simple card game!\n");
        while (originalDeck.cardCheck() != 0) {

        System.out.println("Type A to draw cards from deck.\nType B to discard from your hand \n" +
                "Type C to Retrieve from discarded pile.\n");
        answer = kbd.nextLine();
            switch (answer) {
                case "A":
                    drawCards(hand, originalDeck);
                    break;
                case "B":
                    if (hand.cardCheck() != 0) {
                        discardCards(hand, discardPile);
                    } else {
                        System.out.println("Command cannot be issued, no cards in your hand.");
                    }
                    break;
                case "C":
                    if (discardPile.cardCheck() != 0) {
                        regainCards(hand, discardPile);
                    } else {
                        System.out.println("Command cannot be issued, no cards in the discard pile.");
                    }
                    break;
            }
            printDecks(hand, originalDeck, discardPile);
            rounds++;
        }
        System.out.println("\nThe game is over since there is no cards remaining in the deck. Thanks for playing!");
    }
}


