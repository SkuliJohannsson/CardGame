package com.company;

import java.util.Arrays;
import java.util.List;

/**
 * Created by skuli on 11.06.15.
 */
public class Card  implements Comparable<Card>{

    List<String> suits = Arrays.asList(new String[]{"C", "T", "H", "S"});
    List<String> ranks = Arrays.asList(new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"});

    Suit suit;
    Rank rank;

    public Card(Rank rank, Suit suit) {
        this.suit = suit;
        this.rank = rank;
    }

    //The input sting must be exactly like what a toString method would return.
    //Using the string representation of the card to create it. It is in a way the inverse operation
    //to the method toString.
    public Card(String card) {
        int lastIndex = card.length()-1;

        //the index of 'the textual represetnation of rank/suit' in ranks/suits equals the ordinal in the Enum.
        //It is so because of how the toString operation is made.
        String rank = card.substring(0, lastIndex);
        this.rank = Rank.values()[ranks.indexOf(rank)];

        String suit = card.substring(lastIndex);
        this.suit = Suit.values()[suits.indexOf(suit)];
    }

    @Override
    public String toString() {
        return ranks.get(rank.ordinal()) + suits.get(suit.ordinal());
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

    @Override
    public int compareTo(Card other) {
        int difference = this.suit.compareTo(other.suit);
        if(difference!=0) return difference;
        return this.rank.compareTo(other.rank);
    }
}
