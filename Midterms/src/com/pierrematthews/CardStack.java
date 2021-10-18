package com.pierrematthews;

import java.util.LinkedList;
import java.util.ListIterator;

public class CardStack {
    private LinkedList<Card> stack;
    private int count;

    public CardStack() {
        stack = new LinkedList<Card>();
    }

    public void push (Card newCard)
    {
        stack.push(newCard);
    }

    public Card pop ()
    {
        return stack.pop();
    }

    public  Card peek()
    {
        return  stack.peek();
    }

    public void printDeck()
    {
        int amount = 0;
        ListIterator<Card> iterator = stack.listIterator();
        System.out.print(" -> ");
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
            System.out.print(" -> ");
            amount++;
        }
        System.out.print(" -> "); System.out.print(" -> "); System.out.print(" -> "); System.out.print(" -> "); //line breaker XD
        System.out.println("\nTotal cards: " + amount);
    }
    public int cardCheck() {
        int amount = 0; ListIterator<Card> iterator = stack.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
            amount++;
        }
        return  count = amount;
    }
}