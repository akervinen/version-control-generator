package fi.tuni.tiko.vc.cards;

/**
 * Class representing a single card in the game.
 */
public class Card {
    private int value;
    private int suit;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        this.suit = suit;
    }

    public String toString() {
        return value + "" + suit;
    }
}
