import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
    }

    public int cardCount() {
        return this.deck.size();
    }

    public void addCards() {
        for (SuitType suitType : SuitType.values()) {
            for (RankType rankType : RankType.values()) {
                Card card = new Card(suitType, rankType);
                this.deck.add(card);
            }
        }
    }


    public ArrayList<Card> getCards() {
        return this.deck;
    }

    public void shuffleCards() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        return this.deck.remove(0);
    }
}