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
        resetDeck();
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

    public Card pickTopCard() {
        Card topCard = cards.pollFirst();
        cards.remove(topCard);
        return topCard;
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card pickCard(int i) {
        Card card = cards.get(i);
        cards.remove(card);
        return card;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public void resetDeck() {
        cards = getFullDeck();
        shuffle();
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < cards.size(); i++) {
            str += cards.get(i).toString();
            if (i != cards.size() - 1) {
                str += ", ";
            }
        }
        return str;
    }

    public boolean equals(Deck d) {
        List<Card> otherCards = d.getCards();
        if (cards.size() != otherCards.size()) {
            return false;
        } else {
            for (Card card : otherCards) {
                if (!cards.contains(card)) {
                    return false;
                }
            }
        }
        return true;
    }
}
