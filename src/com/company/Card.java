package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by skuli on 11.06.15.
 */
public class Card implements Comparable<Card> {

    static List<String> suits = Collections.unmodifiableList(Arrays.asList(new String[]{"C", "D", "H", "S"}));
    static List<String> ranks = Collections.unmodifiableList(
            Arrays.asList(new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}));

    String suit;
    String rank;

    /**
     * We use the string representation of a card to create it. It is in a way the inverse operation
     * to the method toString().
     *
     * @param card The input string must be exactly like what the toString() method returns.
     */
    public Card(String card) {
        int lastIndex = card.length() - 1;

        //The first one or two characters..
        rank = card.substring(0, lastIndex);

        //The last character.
        suit = card.substring(lastIndex);
    }

    public static List<Card> getAllCombinations() {
        List<Card> cards = new ArrayList<>();
        for (String r : ranks)
            for (String s : suits)
                cards.add(new Card(r + s));
        return cards;
    }

    @Override
    public String toString() {
        return rank + suit;
    }

    @Override
    public boolean equals(Object other) {
        if (!(other instanceof Card)) {
            return false;
        }

        return this.toString().equals(other.toString());
    }

    @Override
    public int compareTo(Card other) {
        int difference = suits.indexOf(suit) - suits.indexOf(other.suit);
        if (difference != 0) return difference;
        return ranks.indexOf(rank) - ranks.indexOf(other.rank);
    }
}
