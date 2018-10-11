import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;

public class Deck {
    private ArrayList<Card> cards;

    public Deck(){
        cards = new ArrayList<>();
    }

    public int cardCount() {
        return this.cards.size();
    }

    public void populateDeck(){
        for (CardSuit suit: CardSuit.values()){
            for (CardRank rank: CardRank.values()) {
                Card card = new Card(rank, suit);
                this.cards.add(card);
            }
        }
    }

    public Card getFirstCard() {
        return cards.get(0);
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }
}
