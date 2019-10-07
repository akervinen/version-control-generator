package fi.tuni.tiko.vc.cards;

import org.junit.Test;
import org.junit.Assert;

public class DeckTest {
    private Deck deck;

    public DeckTest() {
        deck = new Deck();
    }

    @Test
    public void testEquals() {
        var deck1 = new Deck(false);
        var deck2 = new Deck(false);

        Assert.assertEquals(deck1, deck2);
    }

    @Test
    public void testResetDeck() {
        String originalDeck = deck.toString();
        deck.resetDeck();
        String shuffledDeck = deck.toString();

        // Test if Deck's output changes when the deck is reset.
        Assert.assertFalse(originalDeck.equals(shuffledDeck));
    }

    @Test
    public void testPickTopCard() {
        Card firstCard = deck.getCards().get(0);
        Card topCard = deck.pickTopCard();

        // Test if returned card is instance of Card.
        Assert.assertTrue(
                "Picked card should be instance of Card.",
                topCard instanceof Card);

        // Test if deck's first card equals the picked top card.
        Assert.assertEquals(
                "Picked top card should equal the original first card.",
                firstCard, topCard);

        // Test if the picked top card was removed from the deck.
        Assert.assertFalse(
                "Current first card should not equal the picked card.",
                topCard.equals(deck.getCards().get(0)));

        deck.resetDeck();
        deck.pickTopCard();
        // Test if the picked top card was removed from the deck.
        Assert.assertTrue(deck.getCards().size() == 51);
    }
}
