package fi.tuni.tiko.vc.cards;

/**
 * Class representing a single card in the game.
 */
public class Card {
    private int value;
    private int suit;

    public Card(int value, int suit) {
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
            this.value = -1;
        }
    }

    public int getSuit() {
        return suit;
    }

    public void setSuit(int suit) {
        if (suit < 4 && suit > -1) {
            this.suit = suit;
        } else {
            this.suit = -1;
        }
    }

    public String toString() {
        return value + "" + suit;
    }
}
