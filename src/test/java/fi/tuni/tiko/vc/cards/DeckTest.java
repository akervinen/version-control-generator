package fi.tuni.tiko.vc.cards;

import org.junit.Test;
import org.junit.Assert;

public class DeckTest {
    private Deck deck;

    public DeckTest() {
        deck = new Deck();
    }

    @Test
    public void testResetDeck() {
        String originalDeck = deck.toString();
        deck.resetDeck();
        String shuffledDeck = deck.toString();

        // Tests if Deck's output changes when the deck is reset.
        Assert.assertFalse(originalDeck.equals(shuffledDeck));
    }
}
