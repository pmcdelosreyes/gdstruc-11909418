package com.pierrematthews;
import java.util.Objects;

public class Card {
    private String name;
    private Card nextCard;

    public Card(String name) { this.name = name; }
    public Card() {}
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public Card getNextCard() { return nextCard; }
    public void setNextCard(Card nextCard) { this.nextCard = nextCard; }

    @Override
    public String toString() { return "Card{" + name + '}'; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(name, card.name) && Objects.equals(nextCard, card.nextCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nextCard);
    }
}
