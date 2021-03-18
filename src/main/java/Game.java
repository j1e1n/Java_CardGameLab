import java.util.ArrayList;

public class Game {

    private ArrayList<Player> players;
    private Deck deck;

    public Game(Deck deck) {
        this.deck = new Deck();
        this.players = new ArrayList<Player>();
    }

    public void addPlayer(Player player){
        this.players.add(player);
    }

    public int playerCount(){
        return this.players.size();
    }

    public Deck getDeck() {
        return deck;
    }

    public void dealCards(Player player, Deck deck) {
        Card card = deck.dealCard();
        player.addCardToHand(card);
    }
}