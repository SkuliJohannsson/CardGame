package test.com.company;

import com.company.Card;
import com.company.Deck;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skuli on 11.06.15.
 */
public class DeckTest {

    @Test
    public void testCreation(){
        Assert.assertEquals("2T", new Deck("2T").toString());
        Assert.assertEquals("AS AS", new Deck("AS AS").toString());
        Assert.assertEquals("AS 5C", new Deck("AS 5C").toString());
    }

    @Test
    public void testHasCards(){
        Assert.assertFalse(new Deck(0).hasCards());
        Assert.assertTrue(new Deck().hasCards());
        Assert.assertTrue(new Deck("9T").hasCards());
    }

    @Test
    public void testAddition(){
        Assert.assertEquals("AS", new Deck(0).addCards("AS").toString());
        Assert.assertEquals("2T 3C 7S", new Deck("2T").addCards("3C 7S").toString());
        Assert.assertEquals("4H 9T 3C 7S 9H KC 10S", new Deck("4H 9T").addCards("3C 7S").addCards("9H").addCards("KC 10S").toString());
    }

    @Test
    public void testSize() {
        Assert.assertEquals(0, new Deck(0).size());
        Assert.assertEquals(52, new Deck(1).size());
        Assert.assertEquals(52*2, new Deck(2).size());
        Assert.assertEquals(52*4, new Deck(4).size());
        Assert.assertEquals(52 * 8, new Deck(8).size());
    }

    @Test
    public void testDrawCardOneDeck() {
        Deck d = new Deck();
        List<Card> drawnCards = new ArrayList<>();
        while (d.hasCards()) {
            Card c = d.draw();

            //Asserts that each drawn card is unique.
            Assert.assertFalse(drawnCards.contains(c));
            drawnCards.add(c);
        }

        Assert.assertEquals(52, drawnCards.size());
        Assert.assertNull(d.draw());
    }

    @Test
    public void testDrawCard() {
        Assert.assertEquals("AS AS", drawAll("AS AS"));
        Assert.assertEquals("2C 2C AS", drawAll("AS 2C 2C"));
        Assert.assertEquals("9S 9S QC JT 9S", drawAll("9S JT QC 9S 9S"));
    }

    private String drawAll(String cards) {
        Deck d = new Deck(cards);
        Deck drawnCards = new Deck(0);
        while (d.hasCards()) {
            drawnCards.addCard(d.draw());
        }
        return drawnCards.toString();
    }
}