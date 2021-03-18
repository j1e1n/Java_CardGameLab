import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {

    Deck deck;
    Deck deck2;

    @Before
    public void before(){
        deck = new Deck();
        deck2 = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.cardCount());
    }

    @Test
    public void canAddCardsToDeck(){
        deck.addCards();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void canShuffleDeck(){
        deck.addCards();
        deck2.addCards();
        deck.shuffleCards();
        assertNotEquals(deck.getCards(), deck2.getCards());
    }


    @Test
    public void canDealCard(){
        deck.addCards();
        deck.dealCard();
        assertEquals(51, deck.cardCount());
    }

}
