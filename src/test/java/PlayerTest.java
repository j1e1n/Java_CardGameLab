import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Deck deck;
    Player player;
    Player player2;

    @Before
    public void before(){
        deck = new Deck();
        player = new Player("Steve");
        player2 = new Player("Craig");
    }

    @Test
    public void handStartsEmpty(){
        assertEquals(0, player.handCount());
    }

    @Test
    public void playerHasName(){
        assertEquals("Steve", player.getName());
    }
}