package fi.tuni.tiko.vc.cards;

import java.util.Objects;

/**
 * Class representing a single card in the game.
 */
public class Card {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        setValue(value);
        setSuit(suit);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value < 15 && value > 1) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Card value must be between 2-14");
        }
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return String.format("%2d %s", value, suit);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value &&
                suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, suit);
    }
}
