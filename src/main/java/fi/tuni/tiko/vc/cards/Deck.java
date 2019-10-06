package fi.tuni.tiko.vc.cards;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Deck {
    private LinkedList<Card> cards;
    private LinkedList<Card> fullDeck;

    public Deck() {
        initFullDeck();
        cards = getFullDeck();
    }

    private void initFullDeck() {
        fullDeck = new LinkedList<>();
        for (int value = 2; value < 15; value++) {
            for (int suit = 0; suit < 4; suit++) {
                fullDeck.add(new Card(value, suit));
            }
        }
        cards = getFullDeck();
    }

    private LinkedList<Card> getFullDeck() {
        return fullDeck
                .stream()
                .collect(Collectors.toCollection(LinkedList::new));
    }
}
