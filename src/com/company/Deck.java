package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by skuli on 11.06.15.
 */
public class Deck {

    List<Card> cards = new ArrayList<>();

    public Deck() {
        this(1);
    }

    public Deck(int decks) {
        while (decks-- > 0) addDeck();
    }

    public Deck(String cards) {
        addCards(cards);
    }

    public Deck addCard(Card card) {
        cards.add(card);
        return this;
    }

    public Deck addCards(String cards) {
        for (String c : cards.split(" "))
            addCard(new Card(c));
        return this;
    }

    public Deck addCards(Card[] cards) {
        for (Card c : cards)
            addCard(c);
        return this;
    }

    public void addDeck() {
        cards.addAll(Card.getAllCombinations());
    }

    public Card draw() {

        if (cards.size() == 0) return null;
        return cards.remove(cards.size() - 1);
    }

    public Card[] draw(int count) {
        count = Math.min(count, cards.size());

        Card[] cards = new Card[count];
        for (int i = 0; i < count; i++) {
            cards[i] = draw();
        }

        return cards;
    }

    public boolean hasCards() {
        return !cards.isEmpty();
    }

    //Returns this object. It is not a copy.
    public Deck sort() {
        Collections.sort(cards);
        return this;
    }

    public Deck shuffle() {
        Collections.shuffle(cards);
        return this;
    }

    public int size() {
        return cards.size();
    }

    @Override
    public String toString() {
        return Util.toSimplerString(cards);
    }
}
