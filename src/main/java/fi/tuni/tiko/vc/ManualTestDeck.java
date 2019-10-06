package fi.tuni.tiko.vc;

import fi.tuni.tiko.vc.cards.Deck;

public class ManualTestDeck {
    private Deck deck;

    public ManualTestDeck() {
        deck = new Deck();
        testDeckShuffle();
    }

    private void testDeckShuffle() {
        String originalDeck = deck.toString();
        deck.resetDeck();
        String shuffledDeck = deck.toString();
        System.out.println(originalDeck);
        System.out.println(shuffledDeck);
        System.out.printf("originalDeck.equals(shuffledDeck): %b", originalDeck.equals(shuffledDeck));
    }
}
