import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CardTest {
    Card card;
    @Before
    public void before(){
        card = new Card(CardRank.JACK, CardSuit.DIAMONDS);
    }

    @Test
    public void hasSuit(){
        assertEquals(CardSuit.DIAMONDS, card.getSuit());
    }

    @Test
    public void hasRank(){
        assertEquals(CardRank.JACK, card.getRank());
    }

    @Test
    public void hasRankValue(){
        assertEquals(10, card.getRank().getValue());
    }

}
