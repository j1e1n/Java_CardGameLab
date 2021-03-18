import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class GameTest {

    Game game;
    Player player;
    Player player2;
    Deck deck;

    @Before
    public void before() {
        game = new Game(deck);
        player = new Player("Steve");
        player2 = new Player("Craig");
        deck = new Deck();
    }

    @Test
    public void canAddPlayers(){
        game.addPlayer(player);
        assertEquals(1, game.playerCount());
    }

    @Test
    public void addDeckToGame(){
        assertNotNull(game.getDeck());
    }

    @Test
    public void canDealCardsToPlayers(){
        game.addPlayer(player2);
        game.dealCards(player2, deck);
        assertEquals(1, player2.handCount());
    }


}