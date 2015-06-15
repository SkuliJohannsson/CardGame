package com.company;

/**
 * Created by skuli on 11.06.15.
 */
public class CardGame {


    public Deck deck = new Deck(0);
    public Deck hand = new Deck(0);

    public CardGame(int nrOfDecks) {
        for (int i = 0; i < nrOfDecks; i++)
            deck.addDeck();
    }

    public CardGame() {
        this(1);
    }

    public CardGame(String cards) {
        deck.addCards(cards);
    }

    public Card[] draw(int count) {
        Card[] cards = deck.draw(count);
        hand.addCards(cards);
        return cards;
    }

    public void shuffleDeck() {
        deck.shuffle();
    }

    public void sortDeck() {
        deck.sort();
    }
}
