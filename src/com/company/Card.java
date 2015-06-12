package com.company;

/**
 * Created by skuli on 11.06.15.
 */
public class Card {

    String[] suits = {"♣", "♦", "♥", "♠"};
    String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    Suit suit;
    Rank rank;

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ranks[rank.ordinal()] + suits[suit.ordinal()];
    }


    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Card)) {
            return false;
        }

        Card that = (Card) other;

        return this.suit == that.suit
                && this.rank == that.rank;
    }
}
