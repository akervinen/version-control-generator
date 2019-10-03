public class Card{
    private Suit suit;
    private int value;

    public Card(int value, Suit suit){
        setSuit(suit);
        setValue(value);
    }


    public Suit getSuit() {
        return this.suit;
    }

    public void setSuit(Suit suit) {

        this.suit = suit;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value < 1 || value>13){
            throw new IllegalArgumentException("Card value must be between 1-13");
        }
        this.value = value;
    }

    @Override
    public String toString(){
        String card = suit+" "+value;
        return card;
    }

    
}