import java.util.ArrayList;

public class Player {

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<Card>();
    }

    public int handCount() {
        return this.hand.size();
    }

    public String getName() {
        return name;
    }

    public void addCardToHand(Card card){
        this.hand.add(card);
    }

}