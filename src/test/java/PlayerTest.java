import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlayerTest {
    Player player;
    Card card;
    @Before
    public void before(){
         player = new Player();
         card = new Card(CardRank.JACK, CardSuit.SPADES);
    }

    @Test
    public void canGetCard(){
        assertEquals(0, player.handCount());
        player.addCardToHand(card);
        assertEquals(1, player.handCount());
    }

    @Test
    public void getValueOfCardInHand(){
        player.addCardToHand(card);
        assertEquals(10, player.getHandValue());
    }
}
