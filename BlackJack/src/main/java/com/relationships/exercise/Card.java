package com.relationships.exercise;

/*
BLACKJACK PROJECT ANALYSIS

Core Components:
1. Card Class
   - Properties: suit (Hearts, Diamonds, Clubs, Spades) and value (2-10, J, Q, K, A)
   - Methods to get card information and calculate point value
   - Point values: Number cards = face value, Face cards = 10, Ace = 11

2. Deck Class
   - Contains a collection of 52 Card objects
   - Methods: shuffle(), dealCard()
   - Initialize with all 52 cards in order, then shuffle

3. Hand Class
   - Collection of cards for each player
   - Methods: addCard(), calculateTotal(), displayHand()
   - Logic to handle Ace values (though the exercise only specifies 11 points)

4. Player Class
   - Properties: name, hand
   - Methods: getHandValue(), displayPlayerInfo()

5. Game Class
   - Main game logic
   - Manages players, deck, and game flow
   - Methods: initGame(), dealInitialCards(), determineWinner()

Game Flow:
1. Create players by prompting for names
2. Create and shuffle a deck
3. Deal 2 cards to each player
4. Display each player's hand and card total
5. Calculate which player is closest to 21 without going over
6. Declare the winner

Important Considerations:
- Player with the highest total ≤ 21 wins
- If all players go over 21, no one wins
- This simplified version doesn't include hitting/standing decisions
- No dealer role in this version
*/

public class Card {

    private String suit;
    private String value;


    public static final String HEARTS = "Hearts";
    public static final String DIAMONDS = "Diamonds";
    public static final String CLUBS = "Clubs";
    public static final String SPADES = "Spades";

    public static final String JACK = "Jack";
    public static final String QUEEN = "Queen";
    public static final String KING = "King";
    public static final String ACE = "Ace";

    public Card(String suit, String value) {
        this.suit = suit;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }


    public int getPointValue() {
        if (value.equals("JACK") || value.equals("QUEEN") || value.equals("KING")) {
            return 10;
        } else if (value.equals("ACE")) {
            return 11;
        } else {

            return Integer.parseInt(value);

        }

    }

    /**
     * Returns a string representation of the card.
     *
     * @return A string in the format "VALUE of SUIT"
     */
    @Override
    public String toString() {
        return value + " of " + suit;
    }

}
