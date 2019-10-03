public class Card{
    private int suit;
    private int value;

    public Card(int value, int suit){
        setSuit(suit);
        setValue(value);
    }


    public int getSuit() {
        return this.suit;
    }

    public void setSuit(int suit) {
        if (suit < 0 || suit>3){
            throw new IllegalArgumentException("Card suit must be 0, 1, 2, or 3");
        }
        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value < 1 || value>13){
            throw new IllegalArgumentException("Card value must be between 1-13");
        }
    }

    
}