import org.junit.Before;
import org.junit.Test;

public class GameTest {
    Player player1;
    Player player2;
    Deck deck;
    Game game;

    @Before
    public void before(){
        player1 = new Player();
        player2 = new Player();
        deck = new Deck();
        game = new Game(player1, player2, deck);
    }


}
