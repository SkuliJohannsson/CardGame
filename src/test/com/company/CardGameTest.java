package test.com.company;

import com.company.CardGame;
import com.company.Deck;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by skuli on 11.06.15.
 */
public class CardGameTest {

    @Test
    public void testDraw() {
        CardGame game = new CardGame();
        Assert.assertEquals(0, game.hand.size());
        game.deck = new Deck("AS KS QS");
        game.draw(2);
        Assert.assertEquals("QS KS", game.hand.toString());
        Assert.assertEquals("AS", game.deck.toString());
    }
}