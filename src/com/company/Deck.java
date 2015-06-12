package com.company;

import java.util.ArrayList;

/**
 * Created by skuli on 11.06.15.
 */
public class Deck {

    ArrayList<Card> cards = new ArrayList<>();

    public Deck() {
        for (Rank r : Rank.values()) {
            for (Suit s : Suit.values()) {
                cards.add(new Card(r, s));
            }
        }
    }

//    public ArrayList<Card> getCards(){
//        return cards;
//    }

    public Card draw() {
        return cards.remove(cards.size() - 1);
    }

    public boolean hasCards() {
        return !cards.isEmpty();
    }

    public void sort() {
    }

    @Override
    public String toString() {
        //Joiner.on(" and ").join(names)
        return "";
    }

}
