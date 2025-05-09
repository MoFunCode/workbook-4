package com.relationships.exercise;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> cards;

    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {Card.HEARTS, Card.DIAMONDS, Card.CLUBS, Card.SPADES};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                Card.JACK, Card.QUEEN, Card.KING, Card.ACE};

        for (String suit : suits) {
            for (String value : values) {
                cards.add(new Card(suit, value));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("No cards left in deck");
        }
        return cards.remove(0);
    }

    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card.getValue() + " of " + card.getSuit());
        }
    }

    public int remainingCards() {
        return cards.size();
    }
}

