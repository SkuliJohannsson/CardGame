package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skuli on 11.06.15.
 */
public class CardGame {


    List<Deck> decks = new ArrayList<>();

    public CardGame(int nrOfDecks) {
        for (int i = 0; i < nrOfDecks; i++) {
            decks.add(new Deck());
        }
    }

    public CardGame() {
        this(1);
    }
//
//    public int size() {
//        int size=0;
//        for(Deck d : decks){
//
//        }
//    }
}
