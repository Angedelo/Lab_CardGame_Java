import java.util.ArrayList;

public class Player {
    private ArrayList<Card> hand;

    public Player(){
        this.hand = new ArrayList<>();
    }

    public void addCardToHand(Card card) {
        hand.add(card);
    }

    public int handCount(){
        return this.hand.size();
    }

    public int getHandValue() {
        return this.hand.get(0).getRank().getValue();
    }
}
