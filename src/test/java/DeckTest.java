import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeckTest {
    Deck deck;
    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void deckHasAllCards(){
        assertEquals(0, deck.cardCount());
        deck.populateDeck();
        assertEquals(52, deck.cardCount());
    }

    @Test
    public void checkFirstCard(){
        deck.populateDeck();
        assertEquals(CardSuit.HEARTS, deck.getFirstCard().getSuit());
        assertEquals(CardRank.ACE, deck.getFirstCard().getRank());
    }

    @Test
    public void checkFirstCardAfterShuffle(){
        deck.populateDeck();
        Card card1 = deck.getFirstCard();
        deck.shuffle();
        Card card2 = deck.getFirstCard();
        assertNotEquals(card1, card2);
    }
}
