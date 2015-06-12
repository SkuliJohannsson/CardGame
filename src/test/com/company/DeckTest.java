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
    public void testDrawCard() {
        Deck d = new Deck();
        List<Card> drawnCards = new ArrayList<>();
        while (d.hasCards()) {
            Card c = d.draw();

            //Asserts that each drawn card is unique.
            Assert.assertFalse(drawnCards.contains(c));
            drawnCards.add(c);
        }

        Assert.assertEquals(52, drawnCards.size());
    }

    @Test
    public void testSortCards() throws Exception {
        Deck d = new Deck();
        d.sort();
        Assert.assertEquals("abc", d.toString());
    }
}